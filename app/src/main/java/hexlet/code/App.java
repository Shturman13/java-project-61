package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var gameStartPoint = "Please enter the game number and press Enter";
        System.out.println(gameStartPoint);

        String[] menu = {"1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit"};

        for (var menuItem : menu) {
            System.out.println(menuItem);
        }

        Scanner scanner = new Scanner(System.in);
        String choiceToPlay = scanner.next();


        switch (choiceToPlay) {
            case ("0"):
                scanner.close();
                break;
            case ("1"):
                Engine.welcomeMessage(choiceToPlay);
                scanner.close();
                break;
            case ("2"):
                Engine.welcomeMessage(choiceToPlay);
                Even.evenGame();
                scanner.close();
                break;
            case ("3"):
                Engine.welcomeMessage(choiceToPlay);
                Calculator.calculator();
                scanner.close();
                break;
            case ("4"):
                Engine.welcomeMessage(choiceToPlay);
                Gcd.findGreatestDivisor();
                scanner.close();
                break;
            case ("5"):
                Engine.welcomeMessage(choiceToPlay);
                Progression.missingArgument();
                scanner.close();
                break;
            case ("6"):
                Engine.welcomeMessage(choiceToPlay);
                Prime.primeNumber();
                scanner.close();
                break;
            default:
                System.out.println("wrong input");
                scanner.close();
        }
//        scanner.close();
    }
}
