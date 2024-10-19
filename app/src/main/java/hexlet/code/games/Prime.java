package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (var i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String[] questionAndCorrectAnswer() {
        var question = Engine.randomNumber();
        String correctAnswer;
        if (isPrimeNumber(question)) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return new String[] {String.valueOf(question), correctAnswer};
    }

    public static void primeNumber() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (var i = 0; i < Engine.NUMBEROFATTEMPTS; i++) {
            var output = questionAndCorrectAnswer();
            boolean checkForCorrectAnswer = Engine.commonEngine(output);
            if (!checkForCorrectAnswer) {
                break;
            }
        }
        Engine.congratulations();
    }
}
