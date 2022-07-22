package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import org.apache.commons.lang3.RandomUtils;

public class Calc {

    public static final String NAME_ITEM = "Calc";
    public static final int NUMBER_ITEM = 3;
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static final String RULE = "What is the result of the expression?";

    public static void start() {
        String[][] questionsAndResults = new String[2][Utils.AMOUNT_GAMES];
        for (int numGame = 0; numGame < Utils.AMOUNT_GAMES; numGame++) {
            int[] operands = Utils.generateOperands(2);
            int numOperators = RandomUtils.nextInt(0, OPERATORS.length);
            questionsAndResults[Utils.QUESTION][numGame] = operands[0]
                    + " " + OPERATORS[numOperators]
                    + " " + operands[1];
            questionsAndResults[Utils.RESULT][numGame] = String.valueOf(getResultCalc(numOperators, operands));
        }
        Engine.start(RULE, questionsAndResults);
    }

    public static int getResultCalc(int numOperators, int[] operands) {
        return switch (numOperators) {
            case 0 -> operands[0] + operands[1];
            case 1 -> operands[0] - operands[1];
            case 2 -> operands[0] * operands[1];
            default -> 0;
        };
    }
}
