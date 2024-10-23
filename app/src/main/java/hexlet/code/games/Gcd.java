package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    private static String[] gcdEvklidMethod() {
        var randomNumber1 = Engine.randomNumber();
        var randomNumber2 = Engine.randomNumber();

        var maxNumber = Math.max(randomNumber1, randomNumber2);
        var minNumber = Math.min(randomNumber1, randomNumber2);

        if (minNumber == 0) {
            return new String[] {(randomNumber1 + " " + randomNumber2), String.valueOf(maxNumber)};
        }

        do {
            if (maxNumber >= minNumber) {
                maxNumber = maxNumber % minNumber;
            } else {
                minNumber = minNumber % maxNumber;
            }

        } while ((maxNumber > 0) && (minNumber > 0));
        return new String[] {(randomNumber1 + " " + randomNumber2), String.valueOf(Math.max(maxNumber, minNumber))};
    }

    public static void findGreatestDivisor() {
        System.out.println("Find the greatest common divisor of given numbers.");
        var finalOutput = new String[Engine.NUMBEROFATTEMPTS][2];
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var output = gcdEvklidMethod();
            finalOutput[i] = output;
        }
        Engine.commonEngine(finalOutput);
    }
}
