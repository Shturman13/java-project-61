package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomPoints;

public class Progression {
    private static int[] progression() {
        int[] progression = new int[Engine.LENGTHOFPROGRESSION];
        int increment = RandomPoints.randomNumber(RandomPoints.SMALLRANDOM, RandomPoints.MINNUMBER) + 1;
        int initialNumber = RandomPoints.randomNumber(RandomPoints.SMALLRANDOM, RandomPoints.MINNUMBER);
        progression[0] = initialNumber;
        for (var i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + increment;
        }
        return progression;
    }

    private static int randomProgressionNumber(int[] progression) {
        var randomIndex = RandomPoints.randomNumber(RandomPoints.MAXNUMBERTONINE, RandomPoints.MINNUMBER);
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
        return new String[] {result.toString().trim(), String.valueOf(correctAnswer)};
    }

    public static void missingArgument() {
        System.out.println("What number is missing in the progression?");
        var finalOutput = new String[Engine.NUMBEROFATTEMPTS][2];
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var output = stringBuilderMethod(progression());
            finalOutput[i] = output;
        }
        Engine.commonEngine(finalOutput);
    }
}
