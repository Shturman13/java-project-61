package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;


public class Calculator {
    public static char randomSign() {
        char[] signs = {'+', '-', '*'};
        Random random = new Random();
        int randomIndex = random.nextInt(signs.length);
        return signs[randomIndex];
    }

    public static int correctAnswerWithSign(char sign) {
        var randomNumber1 = Engine.randomNumber();
        var randomNumber2 = Engine.randomNumber();
        var randomSign = randomSign();
        System.out.println("Question: " + randomNumber1 + " "
                + randomSign + " " + randomNumber2);


        var correctAnswer = switch (randomSign) {
            case ('+') -> randomNumber1 + randomNumber2;
            case ('-') -> randomNumber1 - randomNumber2;
            case ('*') -> randomNumber1 * randomNumber2;
            default -> throw new IllegalStateException("Unexpected value: " + randomSign);
        };

        return correctAnswer;
    }

    public static void calculate() {
        System.out.println("What is the result of expression?");
        int counter = 0;
        for (var i = 0; i < 3; i++) {
            int correctAnswer = correctAnswerWithSign(randomSign());
            String playerAnswer = Engine.playerInput();

            if (Integer.parseInt(playerAnswer) == correctAnswer) {
                System.out.println("Correct!");
                counter++;
            } else {
                Engine.wrongAnswer(correctAnswer, playerAnswer);
                break;
            }

        }

        Engine.congratulations(counter);
    }

}
