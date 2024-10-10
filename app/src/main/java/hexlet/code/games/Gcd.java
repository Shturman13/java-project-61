package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Gcd {
    public static void findGreatestDivisor() {
        System.out.println("Find the greatest common divisor of given numbers.");
        int counter = 0;
        for (var i = 0; i < 3; i++) {
            var randomNumber1 = Engine.randomNumber();
            var randomNumber2 = Engine.randomNumber();

            System.out.println(randomNumber1 + " " + randomNumber2);

            var maxNumber = Math.max(randomNumber1, randomNumber2);
            var minNumber = Math.min(randomNumber1, randomNumber2);

            do {
                if (maxNumber >= minNumber) {
                    maxNumber = maxNumber % minNumber;
                } else {
                    minNumber = minNumber % maxNumber;
                }

            } while ((maxNumber > 0) && (minNumber > 0));



            var correctAnswer = Math.max(maxNumber, minNumber);
            var playerAnswer = Engine.playerInput();


            if (Integer.parseInt(playerAnswer) == correctAnswer) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.\n Let's try again, " + Cli.userName + "!");
                break;
            }
        }
        Engine.congratulations(counter);
    }
}
