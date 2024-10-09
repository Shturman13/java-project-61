package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        var gameStartPoint = "Please enter the game number and press Enter";
        System.out.println(gameStartPoint);

        String[] menu = {"1 - Greet", "2 - Even", "3 - Calc", "0 - Exit"};

        for (var menuItem : menu) {
            System.out.println(menuItem);
        }

        Scanner scanner = new Scanner(System.in);
        String choiceToPlay = scanner.next();

        switch (choiceToPlay) {
            case ("1"):
                Engine.welcomeMessage(1);
                break;

            case ("2"):
                Engine.welcomeMessage(2);
                Even.evenNumbersGame();
                break;

            case ("3"):
                Engine.welcomeMessage(3);
                Calculator.calculate();

            default:
                System.out.println("wrong input");
        }
    }
}
