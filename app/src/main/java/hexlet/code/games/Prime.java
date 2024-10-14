package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void primeNumber() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int counter = 0;
        String correctAnswer;
        for (var i = 0; i < 3; i++) {
            var randomNumber = Engine.randomNumber();
            System.out.println("Question: " + randomNumber);
            var playerAnswer = Engine.playerInput();
            if (Engine.isPrimeNumber(randomNumber)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

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
