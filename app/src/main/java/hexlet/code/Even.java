package hexlet.code;

import java.util.Scanner;


public class Even {

    public static String playerInput(){
        Scanner scanner = new Scanner(System.in);
        String playerAnswer = scanner.next();
        System.out.println("Your answer: " +  playerAnswer);
        return playerAnswer;
    }

    public static int randomNumber(){
        return ((int) (Math.random() * 100));
    }

    public static void evenNumbersGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String correctAnswer;
//        var randomNumber = randomNumber();
//        if ((randomNumber % 2) == 0) {
//            correctAnswer = "yes";
//        } else {
//            correctAnswer = "no";
//        }

//        System.out.println("Question: " + randomNumber);
            var counter = 0;
//        var playerAnswer = playerInput();

        for (var i = 0; i < 3; i++) {
            var randomNumber = randomNumber();
            System.out.println("Question: " + randomNumber);

            if ((randomNumber % 2) == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            var playerAnswer = playerInput();

            if (correctAnswer.equals(playerAnswer)) {
                System.out.println("Correct!");
                counter++;
//                randomNumber = randomNumber();
//                System.out.println("Question: " + randomNumber);
//                playerAnswer = playerInput();

            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.\n Let's try again, " + Cli.userName + "!");
                break;
            }


        }

       if (counter == 3) {
           System.out.println("Congratulations, " + Cli.userName + "!");
       }



    }

}
