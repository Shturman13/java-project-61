package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculator {
    private static char randomSign() {
        char[] signs = {'+', '-', '*'};
        var randomIndex = RandomUtils.randomNumber(signs.length - 1, 0);
        return signs[randomIndex];
    }

    private static String[] questionAndCorrectAnswer() {
        var randomNumber1 = RandomUtils.randomNumber(RandomUtils.MAXNUMBER, RandomUtils.MINNUMBER);
        var randomNumber2 = RandomUtils.randomNumber(RandomUtils.MAXNUMBER, RandomUtils.MINNUMBER);
        var randomSign = randomSign();
        var question = randomNumber1 + " "
                + randomSign + " " + randomNumber2;
        var correctAnswer = switch (randomSign) {
            case ('+') -> randomNumber1 + randomNumber2;
            case ('-') -> randomNumber1 - randomNumber2;
            case ('*') -> randomNumber1 * randomNumber2;
            default -> throw new IllegalStateException("Unexpected value: " + randomSign);
        };
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public static void calculator() {
        var gameRules = "What is the result of the expression?";
        var finalOutput = new String[Engine.NUMBEROFATTEMPTS][2];
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var output = questionAndCorrectAnswer();
            finalOutput[i] = output;
        }
        Engine.commonEngine(finalOutput, gameRules);
    }
}
