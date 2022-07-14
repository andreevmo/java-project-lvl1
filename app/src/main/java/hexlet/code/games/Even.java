package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {

    public static final String NAME_ITEM = "Even";
    public static final int NUMBER_ITEM = 2;
    private static int[] operands;
    private static boolean result;
    private static final String RULE = "Answer 'yes' if number even otherwise answer 'no'.";

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
        result = isEven(operands[0]);
    }

    public static void ask() {
        System.out.println("Question: " + operands[0]);
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
