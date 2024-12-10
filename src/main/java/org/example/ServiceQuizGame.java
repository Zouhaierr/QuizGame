package org.example;

import io.grpc.stub.StreamObserver;
import quizgame.QuizGameGrpc;
import quizgame.QuizOuterClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceQuizGame extends QuizGameGrpc.QuizGameImplBase {
    private final List<QuizOuterClass.Quiz> quizzes = new ArrayList<>();
    private final Map<String, QuizOuterClass.Player> players = new HashMap<>();

    public ServiceQuizGame() {
        // Initialize sample quizzes
        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(1)
                .setQuestion("Who developed the theory of relativity?")
                .setAnswer1("Isaac Newton")
                .setAnswer2(" Nikola Tesla")
                .setAnswer3("Albert Einstein")
                .setAnswer4("Marie Curie")
                .setCorrectAnswer(3)
                .build());
        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(2)
                .setQuestion("What is the largest ocean on Earth?")
                .setAnswer1("Atlantic Ocean")
                .setAnswer2("Indian Ocean")
                .setAnswer3("Arctic Ocean")
                .setAnswer4("Pacific Ocean")
                .setCorrectAnswer(4)
                .build());
        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(3)
                .setQuestion("In which year did the Titanic sink?")
                .setAnswer1("1910")
                .setAnswer2("1912")
                .setAnswer3("1915")
                .setAnswer4("1920")
                .setCorrectAnswer(2)
                .build());
        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(4)
                .setQuestion("Which company created the iPhone?")
                .setAnswer1("Samsung")
                .setAnswer2("Apple")
                .setAnswer3("Google")
                .setAnswer4("Microsoft")
                .setCorrectAnswer(2)
                .build());
    }

    public int getNextQuizId() {
        if (quizzes.isEmpty()) {
            return 1;
        }
        return quizzes.stream().mapToInt(QuizOuterClass.Quiz::getId).max().orElse(0) + 1;
    }

    public void addQuiz(QuizOuterClass.Quiz quiz) {
        quizzes.add(quiz);
    }

    public boolean deleteQuiz(int quizId) {
        return quizzes.removeIf(quiz -> quiz.getId() == quizId);
    }

    @Override
    public void registerPlayer(QuizOuterClass.RegisterPlayerRequest request, StreamObserver<QuizOuterClass.RegisterPlayerResponse> responseObserver) {
        String playerName = request.getPlayerName();
        if (!players.containsKey(playerName)) {
            players.put(playerName, QuizOuterClass.Player.newBuilder().setPlayerName(playerName).setScore(0).build());
            responseObserver.onNext(QuizOuterClass.RegisterPlayerResponse.newBuilder().setMessage("Player registered successfully.").build());
        } else {
            responseObserver.onNext(QuizOuterClass.RegisterPlayerResponse.newBuilder().setMessage("Player already exists.").build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getQuiz(QuizOuterClass.GetQuizRequest request, StreamObserver<QuizOuterClass.GetQuizResponse> responseObserver) {
        QuizOuterClass.GetQuizResponse response = QuizOuterClass.GetQuizResponse.newBuilder().addAllQuizzes(quizzes).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void play(QuizOuterClass.PlayRequest request, StreamObserver<QuizOuterClass.PlayResponse> responseObserver)  {
        String playerName = request.getPlayerName();
        int quizId = request.getQuizId();
        int answer = request.getAnswer();

        QuizOuterClass.Player player = players.get(playerName);
        if (player == null) {
            responseObserver.onError(new Exception("Player not registered"));
            return;
        }

        for (QuizOuterClass.Quiz quiz : quizzes) {
            if (quiz.getId() == quizId) {
                boolean correct = (quiz.getCorrectAnswer() == answer);
                int newScore = player.getScore() + (correct ? 10 : 0);
                player = player.toBuilder().setScore(newScore).build();
                players.put(playerName, player);

                responseObserver.onNext(QuizOuterClass.PlayResponse.newBuilder()
                        .setCorrect(correct)
                        .setMessage(correct ? "Correct answer! 🎉" : "Incorrect answer. 😢")
                        .setNewScore(newScore)
                        .build());
                responseObserver.onCompleted();
                return;
            }
        }
        responseObserver.onError(new Exception("Quiz not found"));
    }
}
