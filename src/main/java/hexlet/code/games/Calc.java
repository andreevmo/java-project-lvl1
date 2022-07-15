package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc implements Game {

    public static final String NAME_ITEM = "Calc";
    public static final int NUMBER_ITEM = 3;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static int[] operands;
    private static int numOperators;
    public static final String RULE = "What is the result of the expression?";

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
        numOperators = RandomUtils.nextInt(0, OPERATORS.length);
        return question + operands[0] + " " + OPERATORS[numOperators] + " " + operands[1];
    }

    public final String getResult(String question) {
        return switch (numOperators) {
            case 0 -> String.valueOf(operands[0] + operands[1]);
            case 1 -> String.valueOf(operands[0] - operands[1]);
            case 2 -> String.valueOf(operands[0] * operands[1]);
            default -> "0";
        };
    }
}
