package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void missingArgument() {
        System.out.println("What number is missing in the progression?");
        int counter = 0;
        var numberOfAttempts = 3;
        for (var i = 0; i < numberOfAttempts; i++) {
            var finalProgression = Engine.progressionWithDots(Engine.progression(),
                    Engine.randomProgressionNumber(Engine.progression()));
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
