package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBEROFATTEMPTS = 3;
    public static final int RANGEOFRANDOM = 100;
    public static final int LENGTHOFPROGRESSION = 10;
    public static final int SMALLRANDOMNUMBER = 10;
    public static final int RANDOMRANGETONINE = 9;

    private static String userName;
//  Methods for App.java
    private static String userName() {
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        return userName;
    }

    private static void sayHello() {
        System.out.println("May I have your name?");
        System.out.println("Hello, " + userName() + "!");
    }

    public static void welcomeMessage(String menuItemNumber) {
        System.out.println("Your choice: " + menuItemNumber);
        System.out.println("Welcome to the Brain Games!");
        sayHello();
    }

//    Common methods for all games
    public static void congratulations(int counter) {
        if (counter == NUMBEROFATTEMPTS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static void wrongAnswer(String correctAnswer, String playerAnswer) {
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'.\n Let's try again, " + userName + "!");
    }

    public static int randomNumber() {
        return ((int) (Math.random() * RANGEOFRANDOM));
    }

    private static String playerInput() {
        Scanner scanner = new Scanner(System.in);
        String playerAnswer = scanner.next();
        System.out.println("Your answer: " + playerAnswer);
        return playerAnswer;
    }

    public static void commonEngine(String[][] finalOutput) {
        int counter = 0;
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            System.out.println("Question: " + finalOutput[i][0]);
            var playerAnswer = Engine.playerInput();
            if (finalOutput[i][1].equals(playerAnswer)) {
                System.out.println("Correct!");
                counter++;
            } else {
                Engine.wrongAnswer(finalOutput[i][1], playerAnswer);
                break;
            }
        }
        Engine.congratulations(counter);
    }
}


