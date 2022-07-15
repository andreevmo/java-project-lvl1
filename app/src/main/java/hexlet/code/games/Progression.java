package hexlet.code.games;


import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression implements Game {

    public static final String NAME_ITEM = "Progression";
    public static final int NUMBER_ITEM = 5;
    private static final int PROGRESSION_SIZE = 10;
    private static final String[] PROGRESSION = new String[PROGRESSION_SIZE];
<<<<<<< Updated upstream
    private static String result;
    private static final String RULE = "What number is missing in the progression?";

    public static void start() {

        Engine.sayHello(RULE);

        for (int i = 0; i < Engine.AMOUNT_GAMES; i++) {
=======
    private static int missingElementIndex;
    private static final String RULE = "What number is missing in the progression?";

    @Override
    public final String getRULE() {
        return RULE;
>>>>>>> Stashed changes

    }

<<<<<<< Updated upstream
            if (!(Engine.checkAnswer(result, userAnswer))) {
                return;
            }
        }
=======
    @Override
    public final int getNumItem() {
        return NUMBER_ITEM;
    }
>>>>>>> Stashed changes

    @Override
    public final String getNameItem() {
        return NAME_ITEM;
    }

    public final String generateExpression(String question) {

        int stepInProgressions = Engine.generate();
        missingElementIndex = RandomUtils.nextInt(0, PROGRESSION.length);

        for (int i = 0; i < PROGRESSION.length; i++) {
            if (i == 0) {
                PROGRESSION[0] = String.valueOf(Engine.generate());
            } else {
                PROGRESSION[i] = String.valueOf(Integer.parseInt(PROGRESSION[i - 1]) + stepInProgressions);
            }
        }
<<<<<<< Updated upstream
    }

    public static void ask() {
        int missingElementIndex = RandomUtils.nextInt(0, PROGRESSION.length);
        result = PROGRESSION[missingElementIndex];
        System.out.print("Question:");
=======
        StringBuilder questionBuilder = new StringBuilder(question);
>>>>>>> Stashed changes
        for (int i = 0; i < PROGRESSION.length; i++) {
            if (i == missingElementIndex) {
                questionBuilder.append(".. ");
                continue;
            }
            questionBuilder.append(PROGRESSION[i]).append(" ");
        }
        question = questionBuilder.toString();
        return question;
    }

    public final String getResult(String question) {
        return PROGRESSION[missingElementIndex];
    }
}
