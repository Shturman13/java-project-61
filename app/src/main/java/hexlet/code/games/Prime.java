package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {
    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (var i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String[] questionAndCorrectAnswer() {
        var question = RandomUtils.randomNumber(RandomUtils.MAXNUMBER, RandomUtils.MINNUMBER);
        return new String[] {String.valueOf(question), isPrimeNumber(question) ? "yes" : "no"};
    }

    public static void primeNumber() {
        var choice = "Your choice: 6";
        var gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var finalOutput = new String[Engine.NUMBEROFATTEMPTS][2];
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var output = questionAndCorrectAnswer();
            finalOutput[i] = output;
        }
        Engine.commonEngine(finalOutput, gameRules, choice);
    }
}
