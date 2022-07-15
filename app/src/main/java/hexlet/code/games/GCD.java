package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class GCD {

    public static final String NAME_ITEM = "GCD";
    public static final int NUMBER_ITEM = 4;
    private static int[] operands;
    private static String result;

    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void start() {

        Engine.sayHello(RULE);

        for (int i = 0; i < Engine.AMOUNT_GAMES; i++) {

            generate(Engine.RANGE_FOR_GENERATE);

            ask();

            String userAnswer = Engine.getAnswer();

            if (!(Engine.checkAnswer(result, userAnswer))) {
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    public static void generate(int range) {
        operands = new int[]{RandomUtils.nextInt(1, range), RandomUtils.nextInt(1, range)};

        result = String.valueOf(getGCD(operands[0], operands[1]));
    }

    public static void ask() {
        System.out.println("Question: " + operands[0] + " " + operands[1]);
    }

    private static int getGCD(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        return max % min == 0 ? min : getGCD(min, max % min);
    }
}
