package hexlet.code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int NUMBEROFATTEMPTS = 3;
    public static final int RANGEOFRANDOM = 100;
    public static final int LENGTHOFPROGRESSION = 10;
    public static final int SMALLRANDOMNUMBER = 10;
    public static final int RANDOMRANGETONINE = 9;

    // METHODS TO GET USER INPUT
    private static String userName;

    public static String userName() {
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        return userName;
    }

    public static void sayHello() {
        System.out.println("May I have your name?");
        System.out.println("Hello, " + userName() + "!");
    }


    //    COMMON METHODS FOR App.java
    public static void welcomeMessage(String menuItemNumber) {
        System.out.println("Your choice: " + menuItemNumber);
        System.out.println("Welcome to the Brain Games!");
        sayHello();
    }

//    COMMON METHODS FOR ALL GAMES
    public static void congratulations(int counter) {
//        var numberOfAttempts = 3;
        if (counter == NUMBEROFATTEMPTS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static void wrongAnswer(int correctAnswer, String playerAnswer) {
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'.\n Let's try again, " + userName + "!");
    }

    public static void wrongAnswer(String correctAnswer, String playerAnswer) {
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'.\n Let's try again, " + userName + "!");
    }

    public static int randomNumber() {
        return ((int) (Math.random() * RANGEOFRANDOM));
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

        System.out.println("Question: " + randomNumber1 + " " + randomNumber2);

        var maxNumber = Math.max(randomNumber1, randomNumber2);
        var minNumber = Math.min(randomNumber1, randomNumber2);

        if (minNumber == 0) {
            return maxNumber;
        }

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
        int[] progression = new int[LENGTHOFPROGRESSION];
//        var smallRandomNumber = 10;
        int increment = Engine.randomNumber() / SMALLRANDOMNUMBER;
        int initialNumber = Engine.randomNumber() / SMALLRANDOMNUMBER;
        progression[0] = initialNumber;
        for (var i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + increment;
        }
        return progression;
    }

    public static int randomProgressionNumber(int[] progression) {
//        var randomRangeToNine = 9;
        var randomIndex = (int) ((Math.random()) * RANDOMRANGETONINE);
        var correctAnswer = progression[randomIndex];
        return correctAnswer;
    }

    public static String[] progressionWithDots(int[] progression, int correctAnswer) {
        String[] progressionWithDots = new String[LENGTHOFPROGRESSION];
        correctAnswer = randomProgressionNumber(progression);
        for (var i = 0; i < progression.length; i++) {
            if (correctAnswer == progression[i]) {
                progressionWithDots[i] = "..";
            } else {
                progressionWithDots[i] = String.valueOf(progression[i]);

            }
        }

        String progressionWithoutCommas = Arrays.toString(progressionWithDots).replaceAll(",", "");
        String preparedProgressionItself = progressionWithoutCommas.substring(1,
                (progressionWithoutCommas.length() - 1));
        String[] preparadProgression = {preparedProgressionItself, String.valueOf(correctAnswer)};
        return preparadProgression;
    }


}


