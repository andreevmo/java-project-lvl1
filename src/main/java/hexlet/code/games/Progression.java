package hexlet.code.games;


import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {

    public static final String NAME_ITEM = "Progression";
    public static final int NUMBER_ITEM = 5;
    private static final int PROGRESSION_SIZE = 10;
    private static final String[] PROGRESSION = new String[PROGRESSION_SIZE];

    private static int missingElementIndex;
    public static final String RULE = "What number is missing in the progression?";

    public static String generateExpression(String question) {

        int stepInProgressions = Engine.generate();
        missingElementIndex = RandomUtils.nextInt(0, PROGRESSION.length);

        for (int i = 0; i < PROGRESSION.length; i++) {
            if (i == 0) {
                PROGRESSION[0] = String.valueOf(Engine.generate());
            } else {
                PROGRESSION[i] = String.valueOf(Integer.parseInt(PROGRESSION[i - 1]) + stepInProgressions);
            }
        }

        for (int i = 0; i < PROGRESSION.length; i++) {
            if (i == missingElementIndex) {
                question += ".. ";
                continue;
            }
            question += PROGRESSION[i] + " ";
        }

        return question;
    }

    public static String getResult() {
        return PROGRESSION[missingElementIndex];
    }
}
