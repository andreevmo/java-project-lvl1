package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String NAME_ITEM = "Even";
    public static final int NUMBER_ITEM = 2;
    public static final String RULE = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void start(String userName) {
        int[] operand = new int[Utils.AMOUNT_GAMES];
        String[] question = new String[Utils.AMOUNT_GAMES];
        String[] result = new String[Utils.AMOUNT_GAMES];
        for (int numGame = 0; numGame < Utils.AMOUNT_GAMES; numGame++) {
            operand[numGame] = Utils.generateRandomNumber();
            question[numGame] = String.valueOf(operand[numGame]);
            result[numGame] = operand[numGame] % 2 == 0 ? "yes" : "no";
        }
        Engine.start(RULE, question, result, userName);
    }
}

