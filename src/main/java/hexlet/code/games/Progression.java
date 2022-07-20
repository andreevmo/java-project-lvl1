package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import org.apache.commons.lang3.RandomUtils;

public class Progression {

    public static final String NAME_ITEM = "Progression";
    public static final int NUMBER_ITEM = 5;
    public static final String RULE = "What number is missing in the progression?";
    public static final int SIZE = 10;

    public static void start(String userName) {
        int[][] progression = new int[Utils.AMOUNT_GAMES][];
        int[] missingElement = new int[Utils.AMOUNT_GAMES];
        String[] question = new String[Utils.AMOUNT_GAMES];
        String[] result = new String[Utils.AMOUNT_GAMES];
        for (int numGame = 0; numGame < Utils.AMOUNT_GAMES; numGame++) {
            progression[numGame] = generateProgression(SIZE);
            missingElement[numGame] = RandomUtils.nextInt(0, progression.length);
            question[numGame] = generateQuestion(progression[numGame], missingElement[numGame]);
            result[numGame] = String.valueOf(progression[numGame][missingElement[numGame]]);
        }
        Engine.start(RULE, question, result, userName);
    }

    public static int[] generateProgression(int size) {
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
        String question = "";
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
