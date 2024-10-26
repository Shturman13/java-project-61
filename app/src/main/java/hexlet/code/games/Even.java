package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Even {
    private static String checkForEven(int randomNumber) {
        if ((randomNumber % 2) == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void evenGame() {
        var gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var finalOutput = new String[Engine.NUMBEROFATTEMPTS][2];
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var question = RandomUtils.randomNumber(RandomUtils.MAXNUMBER, RandomUtils.MINNUMBER);
            var correctAnswer = checkForEven(question);
            var output = new String[]{String.valueOf(question), correctAnswer};
            finalOutput[i] = output;
        }
        Engine.commonEngine(finalOutput, gameRules);
    }
}
