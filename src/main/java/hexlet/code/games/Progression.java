package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {

    public static final String NAME_ITEM = "Progression";
    public static final int NUMBER_ITEM = 5;
    public static final String RULE = "What number is missing in the progression?";
    private static boolean isWin = true;
    public static final int SIZE = 10;

    public static void start() {
        for (int i = 0; isWin && i < Utils.AMOUNT_GAMES; i++) {
            int[] progression = generateExpression(SIZE);
            int missingElement = RandomUtils.nextInt(0, progression.length);
            String question = generateQuestion(progression, missingElement);
            String result = String.valueOf(progression[missingElement]);
            isWin = Engine.start(RULE, question, result, i);
        }
    }

    public static int[] generateExpression(int size) {
        int[] progression = new int[size];
        int stepInProgressions = Utils.generateRandomNumber();
        for (int i = 0; i < progression.length; i++) {
            if (i == 0) {
                progression[0] = Utils.generateRandomNumber();
            } else {
                progression[i] = progression[i - 1] + stepInProgressions;
            }
        }
        return progression;
    }

    public static String generateQuestion(int[] progression, int missingElementIndex) {
        String question = "Question: ";
        for (int i = 0; i < progression.length; i++) {
            if (i == missingElementIndex) {
                question += ".. ";
                continue;
            }
            question += progression[i] + " ";
        }
        return question;
    }
}
