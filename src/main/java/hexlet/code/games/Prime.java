package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final String NAME_ITEM = "Prime";
    public static final int NUMBER_ITEM = 6;
    public static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start(String userName) {
        int[] operand = new int[Utils.AMOUNT_GAMES];
        String[] question = new String[Utils.AMOUNT_GAMES];
        String[] result = new String[Utils.AMOUNT_GAMES];
        for (int numGame = 0; numGame < Utils.AMOUNT_GAMES; numGame++) {
            operand[numGame] = Utils.generateRandomNumber();
            question[numGame] = String.valueOf(operand[numGame]);
            result[numGame] = isPrime(operand[numGame]);
        }
        Engine.start(RULE, question, result, userName);
    }

    public static String isPrime(int operand) {
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
