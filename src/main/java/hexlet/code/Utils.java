package hexlet.code;

import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class Utils {

    public static final int RANGE_FOR_GENERATE = 50;
    public static final int AMOUNT_GAMES = 3;

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

    public static boolean checkAnswer(String userAnswer, String result, String userName) {
        if (userAnswer.equals(result)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                    + "Correct answer was '" + result + "'.\n"
                    + "Let's try again, " + userName + "!");
        }
        return false;
    }
}
