package hexlet.code.games;

import hexlet.code.Engine;

public class GCD implements Game {

    public static final String NAME_ITEM = "GCD";
    public static final int NUMBER_ITEM = 4;
    private static int[] operands;

    private static final String RULE = "Find the greatest common divisor of given numbers.";

    @Override
    public final String getRULE() {
        return RULE;
    }

    @Override
    public final int getNumItem() {
        return NUMBER_ITEM;
    }

    @Override
    public final String getNameItem() {
        return NAME_ITEM;
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
