package hexlet.code;

public class RandomUtils {
    public static final int MAXNUMBER = 100;
    public static final int MINNUMBER = 0;
    public static final int MAXNUMBERTONINE = 9;
    public static final int SMALLRANDOM = 10;

    public static int randomNumber(int maxNumber, int minNumber) {
        return ((int) (Math.random() * (maxNumber - minNumber) + minNumber));
    }
}


