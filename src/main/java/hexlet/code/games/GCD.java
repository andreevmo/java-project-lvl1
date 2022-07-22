package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final String NAME_ITEM = "GCD";
    public static final int NUMBER_ITEM = 4;
    public static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[][] questionsAndResults = new String[2][Utils.AMOUNT_GAMES];
        for (int numGame = 0; numGame < Utils.AMOUNT_GAMES; numGame++) {
            int[] operands = Utils.generateOperands(2);
            questionsAndResults[Utils.QUESTION][numGame] = operands[0] + " " + operands[1];
            questionsAndResults[Utils.RESULT][numGame] = String.valueOf(getGCD(operands));
        }
        Engine.start(RULE, questionsAndResults);
    }

    public static int getGCD(int[] operands) {
        int max = Math.max(operands[0], operands[1]);
        int min = Math.min(operands[0], operands[1]);
        int divider = 1;
        while (divider != 0) {
            divider = max % min;
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
}
