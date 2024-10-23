package hexlet.code;

import java.util.Random;

public class RandomPoints {
    public static final int MAXNUMBER = 100;
    public static final int MINNUMBER = 0;
    public static final int MAXNUMBERTONINE = 9;
    public static final int SMALLRANDOM = 10;

    public static int randomNumber(int maxNumber, int minNumber) {
        return ((int) (Math.random() * (maxNumber - minNumber) + minNumber));
    }

    public static int randomChoice(char[] signs) {
        Random random = new Random();
        int randomIndex = random.nextInt(signs.length);
        return randomIndex;
    }
}


