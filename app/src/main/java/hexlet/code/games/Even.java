package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static String checkForEven(int randomNumber) {
        if ((randomNumber % 2) == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void evenGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var question = Engine.randomNumber();
            var correctAnswer = checkForEven(question);
            var output = new String[]{String.valueOf(question), correctAnswer};
            boolean checkForCorrectAnswer = Engine.commonEngine(output);
            if (!checkForCorrectAnswer) {
                break;
            }
        }
        Engine.congratulations(Engine.counter);
    }
}
