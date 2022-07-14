package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {

    public static final String NAME_ITEM = "Prime";
    public static final int NUMBER_ITEM = 6;
    private static int[] operands;
    private static boolean result;
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {

        Cli.makeWelcome();

        System.out.println(RULE);

        for (int i = 0; i < Engine.AMOUNT_GAMES; i++) {

            generate(Engine.RANGE_FOR_GENERATE);

            ask();

            String userAnswer = Engine.getAnswer();

            if (!(Engine.checkAnswerString(result, userAnswer))) {
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    public static void generate(int range) {
        operands = new int[]{RandomUtils.nextInt(1, range)};
        result = isPrime(operands[0]);
    }

    public static void ask() {
        System.out.println("Question: " + operands[0]);
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
