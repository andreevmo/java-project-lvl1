package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static final String NAME_ITEM = "Prime";
    public static final int NUMBER_ITEM = 6;
    public static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static boolean isWin = true;

    public static void start() {
        for (int i = 0; isWin && i < Utils.AMOUNT_GAMES; i++) {
            int operand = Utils.generateRandomNumber();
            String question = String.valueOf(operand);
            String result = getResult(operand);
            isWin = Engine.start(RULE, question, result, i);
        }
    }

    public static String getResult(int operand) {
        if (operand == 1) {
            return "no";
        }
        for (int i = 2; i <= operand / 2; i++) {
            if (operand % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
