package hexlet.code;

import org.apache.commons.lang3.RandomUtils;
import java.util.Scanner;

public class Utils {

    public static final int RANGE_FOR_GENERATE = 50;
    public static final int AMOUNT_GAMES = 3;
    public static final int RESULT = 1;
    public static final int QUESTION = 0;

    public static int generateRandomNumber() {
        return RandomUtils.nextInt(1, RANGE_FOR_GENERATE);
    }

    public static int[] generateOperands(int count) {
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = generateRandomNumber();
        }
        return result;
    }

    public static String getAnswer() {
        System.out.print("Your answer: ");
        return new Scanner(System.in).nextLine();
    }
}
