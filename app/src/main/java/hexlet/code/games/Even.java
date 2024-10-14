package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void evenNumbersGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String correctAnswer;
        var counter = 0;
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var randomNumber = Engine.randomNumber();
            System.out.println("Question: " + randomNumber);

            if ((randomNumber % 2) == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            var playerAnswer = Engine.playerInput();

            if (correctAnswer.equals(playerAnswer)) {
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
