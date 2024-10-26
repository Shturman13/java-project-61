package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBEROFATTEMPTS = 3;
    public static final int LENGTHOFPROGRESSION = 10;

    public static String welcomeMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void commonEngine(String[][] finalOutput, String gameRules) {
        var userName = welcomeMessage();
        System.out.println(gameRules);
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            System.out.println("Question: " + finalOutput[i][0]);
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


