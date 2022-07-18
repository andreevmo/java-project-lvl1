package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static final String NAME_ITEM = "Even";
    public static final int NUMBER_ITEM = 2;
    public static final String RULE = "Answer 'yes' if number even otherwise answer 'no'.";
    private static boolean isWin = true;

    public static void start() {
        for (int i = 0; isWin && i < Utils.AMOUNT_GAMES; i++) {
            int operand = Utils.generateRandomNumber();
            String question = String.valueOf(operand);
            String result = operand % 2 == 0 ? "yes" : "no";
            isWin = Engine.start(RULE, question, result, i);
        }
    }
}
