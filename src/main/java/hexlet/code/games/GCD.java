package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static final String NAME_ITEM = "GCD";
    public static final int NUMBER_ITEM = 4;
    private static int[] operands;

    public static final String RULE = "Find the greatest common divisor of given numbers.";

    public static String generateExpression(String question) {
        operands = new int[]{Engine.generate(), Engine.generate()};
        return question + (operands[0] + " " + operands[1]);
    }

    public static String getResult() {
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
