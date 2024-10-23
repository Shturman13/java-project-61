package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomPoints;

public class Calculator {
    private static char randomSign() {
        char[] signs = {'+', '-', '*'};
        var randomIndex = RandomPoints.randomChoice(signs);
        return signs[randomIndex];
    }

    private static String[] questionAndCorrectAnswer() {
        var randomNumber1 = RandomPoints.randomNumber(RandomPoints.MAXNUMBER, RandomPoints.MINNUMBER);
        var randomNumber2 = RandomPoints.randomNumber(RandomPoints.MAXNUMBER, RandomPoints.MINNUMBER);
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
        System.out.println("What is the result of the expression?");
        var finalOutput = new String[Engine.NUMBEROFATTEMPTS][2];
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var output = questionAndCorrectAnswer();
            finalOutput[i] = output;
        }
        Engine.commonEngine(finalOutput);
    }
}
