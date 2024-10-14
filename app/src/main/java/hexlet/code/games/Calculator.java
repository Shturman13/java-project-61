package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {
    public static void calculate() {
        System.out.println("What is the result of the expression?");
        int counter = 0;
        var numberOfAttempts = 3;
        for (var i = 0; i < numberOfAttempts; i++) {
            int correctAnswer = Engine.correctAnswerWithSign(Engine.randomSign());
            String playerAnswer = Engine.playerInput();

            if (Integer.parseInt(playerAnswer) == correctAnswer) {
                System.out.println("Correct!");
                counter++;
            } else {
                Engine.wrongAnswer(correctAnswer, playerAnswer);
                break;
            }
        }
        Engine.congratulations(counter);
    }
}
