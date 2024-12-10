package org.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import quizgame.QuizGameGrpc;
import quizgame.QuizOuterClass;
import quizgame.QuizOuterClass.*;

public class QuizClient {
    private final QuizGameGrpc.QuizGameBlockingStub quizStub;

    public QuizClient(ManagedChannel channel) {
        quizStub = QuizGameGrpc.newBlockingStub(channel);
    }

    public void registerPlayer(String playerName) {
        RegisterPlayerRequest request = QuizOuterClass.RegisterPlayerRequest.newBuilder().setPlayerName(playerName).build();
        QuizOuterClass.RegisterPlayerResponse response = quizStub.registerPlayer(request);
        System.out.println(response.getMessage());
    }

    public void getQuiz() {
        QuizOuterClass.GetQuizRequest request = QuizOuterClass.GetQuizRequest.newBuilder().build();
        QuizOuterClass.GetQuizResponse response = quizStub.getQuiz(request);
        response.getQuizzesList().forEach(quiz ->
                System.out.println("ID: " + quiz.getId() + " Question: " + quiz.getQuestion())
        );
    }

    public void play(String playerName, int quizId, int answer) {
        QuizOuterClass.PlayRequest request = QuizOuterClass.PlayRequest.newBuilder()
                .setPlayerName(playerName)
                .setQuizId(quizId)
                .setAnswer(answer)
                .build();
        QuizOuterClass.PlayResponse response = quizStub.play(request);
        System.out.println(response.getMessage());
    }

    public void getPlayerScores() {
        GetPlayerScoresRequest request = GetPlayerScoresRequest.newBuilder().build();
        GetPlayerScoresResponse response = quizStub.getPlayerScores(request);
        response.getPlayersList().forEach(player ->
                System.out.println("Player: " + player.getPlayerName() + " Score: " + player.getScore())
        );
    }

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        QuizClient client = new QuizClient(channel);

        // Example usage
        client.registerPlayer("Alice");
        client.getQuiz();
        client.play("Alice", 1, 2);  // assuming Alice answers question 1 with option 2
        client.getPlayerScores();
        channel.shutdown();
    }
}

