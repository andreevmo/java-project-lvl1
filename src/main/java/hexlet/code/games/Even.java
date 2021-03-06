package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String NAME_ITEM = "Even";
    public static final int NUMBER_ITEM = 2;
    public static final String RULE = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void start() {
        String[][] questionsAndResults = new String[2][Utils.AMOUNT_GAMES];
        for (int numGame = 0; numGame < Utils.AMOUNT_GAMES; numGame++) {
            int operand = Utils.generateRandomNumber();
            questionsAndResults[Utils.QUESTION][numGame] = String.valueOf(operand);
            questionsAndResults[Utils.RESULT][numGame] = operand % 2 == 0 ? "yes" : "no";
        }
        Engine.start(RULE, questionsAndResults);
    }
}

