package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {

    public static final String NAME_ITEM = "Progression";
    public static final int NUMBER_ITEM = 5;
    private static final int PROGRESSION_SIZE = 10;
    private static final String[] PROGRESSION = new String[PROGRESSION_SIZE];
    private static String result;
    private static final String RULE = "What number is missing in the progression?";

    public static void start() {

        Engine.sayHello(RULE);

        for (int i = 0; i < Engine.AMOUNT_GAMES; i++) {

            generate(Engine.RANGE_FOR_GENERATE);

            ask();

            String userAnswer = Engine.getAnswer();

            if (!(Engine.checkAnswer(result, userAnswer))) {
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    public static void generate(int range) {

        int stepInProgressions = RandomUtils.nextInt(1, range);

        for (int i = 0; i < PROGRESSION.length; i++) {
            if (i == 0) {
                PROGRESSION[0] = String.valueOf(RandomUtils.nextInt(1, range));
            } else {
                PROGRESSION[i] = String.valueOf(Integer.parseInt(PROGRESSION[i - 1]) + stepInProgressions);
            }
        }
    }

    public static void ask() {
        int missingElementIndex = RandomUtils.nextInt(0, PROGRESSION.length);
        result = PROGRESSION[missingElementIndex];
        System.out.print("Question:");
        for (int i = 0; i < PROGRESSION.length; i++) {
            if (i == missingElementIndex) {
                System.out.print(" ..");
                continue;
            }
            System.out.print(" " + PROGRESSION[i]);
        }
        System.out.println();
    }
}
