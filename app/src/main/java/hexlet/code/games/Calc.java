package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc implements Game {

    public static final String NAME_ITEM = "Calc";
    public static final int NUMBER_ITEM = 3;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static int[] operands;
    private static int numOperators;
<<<<<<< Updated upstream
    private static String result;
    private static final String RULE = "What is the result of the expression?";

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
        operands = new int[]{RandomUtils.nextInt(1, range), RandomUtils.nextInt(1, range)};
        numOperators = RandomUtils.nextInt(0, OPERATORS.length);

        result = switch (numOperators) {
            case 0 -> add(operands[0], operands[1]);
            case 1 -> subtract(operands[0], operands[1]);
            case 2 -> multiply(operands[0], operands[1]);
            default -> "0";
        };
=======
    public static final String RULE = "What is the result of the expression?";

    @Override
    public final String getRULE() {
        return RULE;
    }

    @Override
    public final int getNumItem() {
        return NUMBER_ITEM;
>>>>>>> Stashed changes
    }

    @Override
    public final String getNameItem() {
        return NAME_ITEM;
    }

<<<<<<< Updated upstream
    private static String multiply(int a, int b) {
        return String.valueOf(a * b);
    }

    private static String add(int a, int b) {
        return String.valueOf(a + b);
    }

    private static String subtract(int a, int b) {
        return String.valueOf(a - b);
=======
    public final String generateExpression(String question) {
        operands = new int[]{Engine.generate(), Engine.generate()};
        numOperators = RandomUtils.nextInt(0, OPERATORS.length);
        return question + operands[0] + " " + OPERATORS[numOperators] + " " + operands[1];
    }

    public final String getResult(String question) {
        return switch (numOperators) {
            case 0 -> String.valueOf(operands[0] + operands[1]);
            case 1 -> String.valueOf(operands[0] - operands[1]);
            case 2 -> String.valueOf(operands[0] * operands[1]);
            default -> "0";
        };
>>>>>>> Stashed changes
    }
}
