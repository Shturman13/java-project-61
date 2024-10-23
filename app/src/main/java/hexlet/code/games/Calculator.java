package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calculator {
    private static char randomSign() {
        char[] signs = {'+', '-', '*'};
        Random random = new Random();
        int randomIndex = random.nextInt(signs.length);
        return signs[randomIndex];
    }

    private static String[] questionAndCorrectAnswer() {
        var randomNumber1 = Engine.randomNumber();
        var randomNumber2 = Engine.randomNumber();
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
