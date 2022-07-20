package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final String NAME_ITEM = "GCD";
    public static final int NUMBER_ITEM = 4;
    public static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void start(String userName) {
        String[] question = new String[Utils.AMOUNT_GAMES];
        String[] result = new String[Utils.AMOUNT_GAMES];
        int[][] operands = new int[Utils.AMOUNT_GAMES][];
        for (int numGame = 0; numGame < Utils.AMOUNT_GAMES; numGame++) {
            operands[numGame] = Utils.generateOperands(2);
            question[numGame] = operands[numGame][0] + " " + operands[numGame][1];
            result[numGame] = getGCD(operands[numGame]);
        }
        Engine.start(RULE, question, result, userName);
    }

    public static String getGCD(int[] operands) {
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
