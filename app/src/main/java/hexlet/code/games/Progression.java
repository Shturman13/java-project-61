package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;

public class Progression {
    public static int[] progression() {
        int[] progression = new int[10];
        int increment = Engine.randomNumber() / 10;
        int initialNumber = Engine.randomNumber() / 10;
        progression[0] = initialNumber;
        for (var i = 1; i < progression.length; i++){
            progression[i] = progression[i-1] + increment;
        }
        return progression;
    }
    public static int randomProgressionNumber(int[] progression) {
        var randomIndex = (int) ((Math.random()) * 9);
        var correctAnswer = progression[randomIndex];
        return correctAnswer;
    }

    public static String[] progressionWithDots(int[] progression, int correctAnswer) {
        String[] progressionWithDots = new String[10];
        correctAnswer = randomProgressionNumber(progression);
            for (var i = 0; i < progression.length; i++) {
                if (progression[i] != correctAnswer) {
                    progressionWithDots[i] = String.valueOf(progression[i]);
                } else {
                    progressionWithDots[i] = "..";
                }

            }

        String progressionWithoutCommas = Arrays.toString(progressionWithDots).replaceAll(",", "");
        String preparedProgressionItself = progressionWithoutCommas.substring(1, (progressionWithoutCommas.length() - 1));
        String[] preparadProgression = {preparedProgressionItself, String.valueOf(correctAnswer)};
        return preparadProgression;
    }


    public static void missingArgument() {
        System.out.println("What number is missing in the progression?");
        int counter = 0;
        for (var i = 0; i < 3; i++) {
            var finalProgression = progressionWithDots(progression(), randomProgressionNumber(progression()));
            System.out.println("Question: " + finalProgression[0]);
            String playerAnswer = Engine.playerInput();

            if (playerAnswer.equals(finalProgression[1])) {
                System.out.println("Correct!");
                counter++;
            } else {
                Engine.wrongAnswer(finalProgression[1], playerAnswer);
                break;
            }

        }

        Engine.congratulations(counter);
    }

}
