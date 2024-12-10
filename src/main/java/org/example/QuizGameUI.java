package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import quizgame.QuizGameGrpc;
import quizgame.QuizOuterClass.*;

public class QuizGameUI extends JFrame {

    private QuizGameGrpc.QuizGameBlockingStub stub;
    private String playerName;
    private int currentQuestionIndex = 0;
    private int correctAnswers = 0;
    private int incorrectAnswers = 0;
    private int totalScore = 0;
    private java.util.List<Quiz> quizzes;

    // GUI Components
    private JLabel questionLabel;
    private JButton[] answerButtons; // Changed to JButton for square-shaped buttons
    private ButtonGroup answerGroup;
    private JButton nextButton;
    private JLabel scoreLabel;
    private JLabel playerInfoLabel;
    private JTabbedPane tabbedPane;

    public QuizGameUI() {
        // gRPC channel setup
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        stub = QuizGameGrpc.newBlockingStub(channel);

        // Player registration
        playerName = JOptionPane.showInputDialog(this, "Enter your name:");
        if (playerName == null || playerName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        stub.registerPlayer(RegisterPlayerRequest.newBuilder().setPlayerName(playerName).build());

        // Retrieve quizzes
        GetQuizResponse quizResponse = stub.getQuiz(GetQuizRequest.newBuilder().build());
        quizzes = quizResponse.getQuizzesList();

        // Initialize main JFrame
        setTitle("Quiz Game - Enhanced UI");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Tabs setup
        tabbedPane = new JTabbedPane();
        add(tabbedPane, BorderLayout.CENTER);

        // Quiz Tab
        JPanel quizPanel = createQuizPanel();
        tabbedPane.addTab("Quiz", quizPanel);

        // Score Tab
        JPanel scorePanel = createScorePanel();
        tabbedPane.addTab("Scores", scorePanel);

        // Player Info Tab
        JPanel playerInfoPanel = createPlayerInfoPanel();
        tabbedPane.addTab("Player Info", playerInfoPanel);

        // Display the first question
        displayQuestion();
    }

    private JPanel createQuizPanel() {
        JPanel quizPanel = new JPanel();
        quizPanel.setLayout(new BoxLayout(quizPanel, BoxLayout.Y_AXIS));

        questionLabel = new JLabel("Question will appear here.");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        quizPanel.add(questionLabel);

        answerButtons = new JButton[4]; // Changed to JButton
        JPanel answerPanel = new JPanel(new GridLayout(2, 2, 10, 10)); // 2x2 grid for square layout
        for (int i = 0; i < 4; i++) {
            answerButtons[i] = new JButton("Option " + (i + 1));
            answerButtons[i].setFont(new Font("Arial", Font.PLAIN, 16));
            answerButtons[i].setPreferredSize(new Dimension(150, 150)); // Make buttons larger
            answerPanel.add(answerButtons[i]);
            final int answerIndex = i + 1; // Store the answer index
            answerButtons[i].addActionListener(e -> handleAnswerSelection(answerIndex));
        }
        quizPanel.add(answerPanel);

        nextButton = new JButton("Next");
        nextButton.addActionListener(new NextButtonListener());
        quizPanel.add(nextButton);

        return quizPanel;
    }

    private JPanel createScorePanel() {
        JPanel scorePanel = new JPanel(new BorderLayout());
        scoreLabel = new JLabel("Scores will appear here.");
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        scorePanel.add(scoreLabel, BorderLayout.CENTER);
        return scorePanel;
    }

    private JPanel createPlayerInfoPanel() {
        JPanel playerInfoPanel = new JPanel(new BorderLayout());
        playerInfoLabel = new JLabel("Player details will appear here.");
        playerInfoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        playerInfoLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        playerInfoPanel.add(playerInfoLabel, BorderLayout.CENTER);
        return playerInfoPanel;
    }

    private void displayQuestion() {
        if (currentQuestionIndex < quizzes.size()) {
            Quiz quiz = quizzes.get(currentQuestionIndex);
            questionLabel.setText("Q" + (currentQuestionIndex + 1) + ": " + quiz.getQuestion());
            answerButtons[0].setText(quiz.getAnswer1());
            answerButtons[1].setText(quiz.getAnswer2());
            answerButtons[2].setText(quiz.getAnswer3());
            answerButtons[3].setText(quiz.getAnswer4());
        } else {
            showFinalResults();
        }
    }

    private void showFinalResults() {
        nextButton.setText("View Final Results");
        nextButton.removeActionListener(nextButton.getActionListeners()[0]);
        nextButton.addActionListener(e -> {
            // Switch to Score tab and show results
            tabbedPane.setSelectedIndex(1);
            scoreLabel.setText("<html>Player: " + playerName + "<br>" +
                    "Correct Answers: " + correctAnswers + "<br>" +
                    "Incorrect Answers: " + incorrectAnswers + "<br>" +
                    "Total Score: " + totalScore + "</html>");
        });
    }

    private void handleAnswerSelection(int selectedAnswer) {
        Quiz quiz = quizzes.get(currentQuestionIndex);
        PlayResponse playResponse = stub.play(PlayRequest.newBuilder()
                .setPlayerName(playerName)
                .setQuizId(quiz.getId())
                .setAnswer(selectedAnswer)
                .build());

        if (playResponse.getCorrect()) {
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }

        totalScore = playResponse.getNewScore();
        currentQuestionIndex++;

        displayQuestion();
    }

    private class NextButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (currentQuestionIndex < quizzes.size()) {
                displayQuestion();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuizGameUI().setVisible(true));
    }
}
