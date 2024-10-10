package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void welcomeMessage(int menuItemNumber) {
        System.out.println("Your choice: " + menuItemNumber);
        System.out.println("Welcome to the Brain Games!");
        Cli.sayHello();
    }

    public static int randomNumber() {
        return ((int) (Math.random() * 100));
    }

    public static String playerInput() {
        Scanner scanner = new Scanner(System.in);
        String playerAnswer = scanner.next();
        System.out.println("Your answer: " +  playerAnswer);
        return playerAnswer;
    }

    public static void congratulations(int counter) {
        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }

    }

    public static int gcdEvklidMethod() {
        var randomNumber1 = randomNumber();
        var randomNumber2 = randomNumber();

        System.out.println(randomNumber1 + " " + randomNumber2);

        var maxNumber = Math.max(randomNumber1, randomNumber2);
        var minNumber = Math.min(randomNumber1, randomNumber2);

        do {
            if (maxNumber >= minNumber) {
                maxNumber = maxNumber % minNumber;
            } else {
                minNumber = minNumber % maxNumber;
            }

        } while ((maxNumber > 0) && (minNumber > 0));

        return Math.max(maxNumber, minNumber);
    }

    public static void wrongAnswer(int correctAnswer, String playerAnswer) {
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'.\n Let's try again, " + Cli.userName + "!");
    }

    public static void wrongAnswer(String correctAnswer, String playerAnswer) {
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'.\n Let's try again, " + Cli.userName + "!");
    }
}


