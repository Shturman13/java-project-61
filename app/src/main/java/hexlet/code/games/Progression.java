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

    private static String[] progressionWithDots(int[] progression) {
        String[] progressionWithDots = new String[Engine.LENGTHOFPROGRESSION];
        var correctAnswer = randomProgressionNumber(progression);
        for (var i = 0; i < progression.length; i++) {
            if (correctAnswer == progression[i]) {
                progressionWithDots[i] = "..";
            } else {
                progressionWithDots[i] = String.valueOf(progression[i]);
            }
        }

        String progressionWithoutCommas = Arrays.toString(progressionWithDots).replaceAll(",", "");
        String preparedProgressionItself = progressionWithoutCommas.substring(1,
                (progressionWithoutCommas.length() - 1));
        String[] preparadProgression = {preparedProgressionItself, String.valueOf(correctAnswer)};
        return preparadProgression;
    }

    public static void missingArgument() {
        System.out.println("What number is missing in the progression?");

        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var output = progressionWithDots(progression());
            boolean checkForCorrectAnswer = Engine.commonEngine(output);
            if (!checkForCorrectAnswer) {
                break;
            }
        }

        Engine.congratulations();
    }
}
