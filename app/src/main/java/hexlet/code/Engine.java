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
}


