package hexlet.code;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        var gameStartPoint = "Please enter the game number and press Enter";
//        var greetChoice = 1;
//        var evenChoice = 2;
//        var exitChoice = 0;
        String[] menu = {"1 - Greet", "2 - Even", "0 - Exit"};

        System.out.println(gameStartPoint);
        for (var menuItem : menu) {
            System.out.println(menuItem);
        }

        Scanner scanner = new Scanner(System.in);
        String choiceToPlay = scanner.next();

        if (choiceToPlay.equals("1")) {
            System.out.println("Your choice: 1");
            System.out.println("Welcome to the Brain Games!");
            Cli.sayHello();

        } else if (choiceToPlay.equals("2")) {
            System.out.println("Your choice: 2");
            System.out.println("Welcome to the Brain Games!");
            Cli.sayHello();
            Even.evenNumbersGame();

        }
    }
}
