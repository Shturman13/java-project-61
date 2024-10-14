package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void findGreatestDivisor() {
        System.out.println("Find the greatest common divisor of given numbers.");
        int counter = 0;
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var correctAnswer = Engine.gcdEvklidMethod();
            var playerAnswer = Engine.playerInput();

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
