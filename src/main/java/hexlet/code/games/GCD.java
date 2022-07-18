package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static final String NAME_ITEM = "GCD";
    public static final int NUMBER_ITEM = 4;

    public static final String RULE = "Find the greatest common divisor of given numbers.";
    private static boolean isWin = true;

    public static void start() {
        for (int i = 0; isWin && i < Utils.AMOUNT_GAMES; i++) {
            int[] operands = Utils.generateOperands(2);
            String question = operands[0] + " " + operands[1];
            String result = getResult(operands);
            isWin = Engine.start(RULE, question, result, i);
        }
    }

    public static String getResult(int[] operands) {
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
