package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final String NAME_ITEM = "Prime";
    public static final int NUMBER_ITEM = 6;
    public static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        String[][] questionsAndResults = new String[2][Utils.AMOUNT_GAMES];
        for (int numGame = 0; numGame < Utils.AMOUNT_GAMES; numGame++) {
            int operand = Utils.generateRandomNumber();
            questionsAndResults[Utils.QUESTION][numGame] = String.valueOf(operand);
            questionsAndResults[Utils.RESULT][numGame] = isPrime(operand) ? "yes" : "no";
        }
        Engine.start(RULE, questionsAndResults);
    }

    public static boolean isPrime(int operand) {
        if (operand == 1) {
            return false;
        }
        for (int i = 2; i <= operand / 2; i++) {
            if (operand % i == 0) {
                return false;
            }
        }
        return true;
    }
}
