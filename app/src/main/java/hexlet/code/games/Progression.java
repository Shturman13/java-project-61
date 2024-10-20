package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;

public class Progression {
    private static int[] progression() {
        int[] progression = new int[Engine.LENGTHOFPROGRESSION];
        int increment = Engine.randomNumber() / Engine.SMALLRANDOMNUMBER;
        int initialNumber = Engine.randomNumber() / Engine.SMALLRANDOMNUMBER;
        progression[0] = initialNumber;
        for (var i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + increment;
        }
        return progression;
    }

    private static int randomProgressionNumber(int[] progression) {
        var randomIndex = (int) ((Math.random()) * Engine.RANDOMRANGETONINE);
        return progression[randomIndex];
    }

    private static String[] stringBuilderMethod(int[] progression) {
        var result = new StringBuilder();
        var correctAnswer = randomProgressionNumber(progression);
        for (var item : progression) {
            if (correctAnswer == item) {
                result.append("..");
                result.append(" ");
            } else {
                result.append(item);
                result.append(" ");

            }
        }
        return new String[] {result.toString(), String.valueOf(correctAnswer)};
    }

    public static void missingArgument() {
        System.out.println("What number is missing in the progression?");

        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var output = stringBuilderMethod(progression());
            boolean checkForCorrectAnswer = Engine.commonEngine(output);
            if (!checkForCorrectAnswer) {
                break;
            }
        }
        Engine.congratulations();
    }
}
