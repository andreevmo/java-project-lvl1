package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {

    public static final String NAME_ITEM = "Calc";
    public static final int NUMBER_ITEM = 3;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static int[] operands;
    private static int numOperators;
    private static int result;
    private static final String RULE = "What is the result of the expression?";

    public static void start() {

        Cli.makeWelcome();

        System.out.println(RULE);

        for (int i = 0; i < Engine.AMOUNT_GAMES; i++) {

            generate(Engine.RANGE_FOR_GENERATE);

            ask();

            String userAnswer = Engine.getAnswer();

            if (!(Engine.checkAnswerInt(result, userAnswer))) {
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
            default -> 0;
        };
    }

    public static void ask() {
        System.out.println("Question: " + operands[0] + " " + OPERATORS[numOperators] + " " + operands[1]);
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }
}
