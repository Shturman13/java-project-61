package hexlet.code;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Even {
    public static void evenNumbersGame() {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var randomNumber = ((int) (Math.random() * 100));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Question: " + randomNumber);
        String playerAnswer = scanner.next();
//                if (Integer.parseInt(playerAnswer) == ())
//            System.out.println("Your answer: " + playerAnswer);
        System.out.println("Your answer: " +  playerAnswer);
//        scanner.close();
    }

}
