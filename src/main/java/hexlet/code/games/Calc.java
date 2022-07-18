package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {

    public static final String NAME_ITEM = "Calc";
    public static final int NUMBER_ITEM = 3;
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static final String RULE = "What is the result of the expression?";
    private static boolean isWin = true;

    public static void start() {
        for (int i = 0; isWin && i < Utils.AMOUNT_GAMES; i++) {
            int[] operands = Utils.generateOperands(2);
            int numOperators = RandomUtils.nextInt(0, OPERATORS.length);
            String question = operands[0] + " " + OPERATORS[numOperators] + " " + operands[1];
            String result = getResult(numOperators, operands);
            isWin = Engine.start(RULE, question, result, i);
        }
    }

    public static String getResult(int numOperators, int[] operands) {
        return switch (numOperators) {
            case 0 -> String.valueOf(operands[0] + operands[1]);
            case 1 -> String.valueOf(operands[0] - operands[1]);
            case 2 -> String.valueOf(operands[0] * operands[1]);
            default -> "0";
        };
    }
}
