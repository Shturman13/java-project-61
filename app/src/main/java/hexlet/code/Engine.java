package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBEROFATTEMPTS = 3;
    public static final int LENGTHOFPROGRESSION = 10;

    private static String userName;
//  Methods for App.java

    public static void welcomeMessage(String menuItemNumber) {
        System.out.println("Your choice: " + menuItemNumber);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void commonEngine(String[][] finalOutput) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            System.out.println("Question: " + finalOutput[i][0]);

//            Scanner scanner = new Scanner(System.in);
            String playerAnswer = scanner.next();
            System.out.println("Your answer: " + playerAnswer);

            if (finalOutput[i][1].equals(playerAnswer)) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + finalOutput[i][1] + "'.\n Let's try again, " + userName + "!");
                break;
            }
        }
        if (counter == NUMBEROFATTEMPTS) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }
}


