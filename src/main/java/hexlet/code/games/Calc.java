package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import org.apache.commons.lang3.RandomUtils;

public class Calc {

    public static final String NAME_ITEM = "Calc";
    public static final int NUMBER_ITEM = 3;
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static final String RULE = "What is the result of the expression?";

    public static void start(String userName) {
        String[] question = new String[Utils.AMOUNT_GAMES];
        String[] result = new String[Utils.AMOUNT_GAMES];
        int[][] operands = new int[Utils.AMOUNT_GAMES][];
        int[] numOperators = new int[Utils.AMOUNT_GAMES];
        for (int numGame = 0; numGame < Utils.AMOUNT_GAMES; numGame++) {
            operands[numGame] = Utils.generateOperands(2);
            numOperators[numGame] = RandomUtils.nextInt(0, OPERATORS.length);
            question[numGame] = operands[numGame][0]
                    + " " + OPERATORS[numOperators[numGame]]
                    + " " + operands[numGame][1];
            result[numGame] = getResultCalc(numOperators[numGame], operands[numGame]);
        }
        Engine.start(RULE, question, result, userName);
    }

    public static String getResultCalc(int numOperators, int[] operands) {
        return switch (numOperators) {
            case 0 -> String.valueOf(operands[0] + operands[1]);
            case 1 -> String.valueOf(operands[0] - operands[1]);
            case 2 -> String.valueOf(operands[0] * operands[1]);
            default -> "0";
        };
    }
}
