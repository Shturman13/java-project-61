package hexlet.code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Engine {
//    COMMON METHODS FOR App.java
    public static void welcomeMessage(int menuItemNumber) {
        System.out.println("Your choice: " + menuItemNumber);
        System.out.println("Welcome to the Brain Games!");
        Cli.sayHello();
    }

//    COMMON METHODS FOR ALL GAMES
    public static void congratulations(int counter) {
        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }

    public static void wrongAnswer(int correctAnswer, String playerAnswer) {
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'.\n Let's try again, " + Cli.userName + "!");
    }

    public static void wrongAnswer(String correctAnswer, String playerAnswer) {
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'.\n Let's try again, " + Cli.userName + "!");
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

//    METHODS FOR GCD.java
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

//    METHODS FOR Calculator.java
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

//    METHODS FOR Prime.java
    public static boolean isPrimeNumber(int number) {
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

//    METHODS FOR Progression.java
    public static int[] progression() {
        int[] progression = new int[10];
        int increment = Engine.randomNumber() / 10;
        int initialNumber = Engine.randomNumber() / 10;
        progression[0] = initialNumber;
        for (var i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + increment;
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
        String preparedProgressionItself = progressionWithoutCommas.substring(1,
                (progressionWithoutCommas.length() - 1));
        String[] preparadProgression = {preparedProgressionItself, String.valueOf(correctAnswer)};
        return preparadProgression;
    }


}


