package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static String checkForEven(int randomNumber) {
        if ((randomNumber % 2) == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void evenGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var finalOutput = new String[Engine.NUMBEROFATTEMPTS][2];
        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var question = Engine.randomNumber();
            var correctAnswer = checkForEven(question);
            var output = new String[]{String.valueOf(question), correctAnswer};
            finalOutput[i] = output;
        }
        Engine.commonEngine(finalOutput);
    }

//    public static void evenGame() {
//        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
//        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
//            var question = Engine.randomNumber();
//            var correctAnswer = checkForEven(question);
//            var output = new String[]{String.valueOf(question), correctAnswer};
//            boolean checkForCorrectAnswer = Engine.commonEngine(output);
//            if (!checkForCorrectAnswer) {
//                break;
//            }
//        }
//    }

//    public static void commonEngine2(String[][] finalOutput) {
//        int counter = 0;
//        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
//            System.out.println("Question: " + finalOutput[i][0]);
//            var playerAnswer = Engine.playerInput();
//            if (finalOutput[i][1].equals(playerAnswer)) {
//                System.out.println("Correct!");
//                counter++;
//            } else {
//                Engine.wrongAnswer(finalOutput[i][1], playerAnswer);
//                break;
//            }
//        }
//        Engine.congratulations(counter);
//    }





}
