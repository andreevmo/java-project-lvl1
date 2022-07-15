package hexlet.code.games;

import hexlet.code.Engine;

public class GCD implements Game {

    public static final String NAME_ITEM = "GCD";
    public static final int NUMBER_ITEM = 4;
    private static int[] operands;
<<<<<<< Updated upstream
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
=======

    private static final String RULE = "Find the greatest common divisor of given numbers.";

    @Override
    public final String getRULE() {
        return RULE;
>>>>>>> Stashed changes
    }

    @Override
    public final int getNumItem() {
        return NUMBER_ITEM;
    }

<<<<<<< Updated upstream
        result = String.valueOf(getGCD(operands[0], operands[1]));
=======
    @Override
    public final String getNameItem() {
        return NAME_ITEM;
>>>>>>> Stashed changes
    }

    public final String generateExpression(String question) {
        operands = new int[]{Engine.generate(), Engine.generate()};
        return question + (operands[0] + " " + operands[1]);
    }

    public final String getResult(String question) {
        int max = Math.max(operands[0], operands[1]);
        int min = Math.min(operands[0], operands[1]);
        int divider = 1;
        while (divider != 0) {
            divider = max % min;
            int temp = min;
            min = max % min;
            max = temp;
        }
        return String.valueOf(max);
    }
}
