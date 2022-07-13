package hexlet.code;

import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class Calc implements Game {

    private String nameItem = "Calc";
    private String userAnswer;
    private int numberItem = 3;
    private char[] operators = {'+', '-', '*'};
    private int[] operands;
    private int numOperators;
    private int result;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public final int getNumItem() {
        return this.numberItem;
    }

    @Override
    public final String getNameItem() {
        return this.nameItem;
    }

    @Override
    public final void greet() {
        Cli.makeWelcome();
        System.out.println("What is the result of the expression?");
    }

    @Override
    public final void generate() {
        int maximumOperands = 50;
        operands = new int[]{RandomUtils.nextInt(1, maximumOperands), RandomUtils.nextInt(1, maximumOperands)};
        numOperators = RandomUtils.nextInt(0, operators.length);

        result = switch (numOperators) {
            case 0 -> add(operands[0], operands[1]);
            case 1 -> subtract(operands[0], operands[1]);
            case 2 -> multiply(operands[0], operands[1]);
            default -> 0;
        };
    }

    @Override
    public final void ask() {
        System.out.println("Question: " + operands[0] + " " + operators[numOperators] + " " + operands[1]);
    }

    @Override
    public final void getAnswer() {
        System.out.print("Your answer: ");
        userAnswer = scanner.nextLine();
    }

    @Override
    public final boolean checkAnswer() {
        boolean isCorrect = false;

        boolean correctUserInput = new Scanner(userAnswer).hasNextInt();


        if (correctUserInput && result == Integer.parseInt(userAnswer)) {
            System.out.println("Correct!");
            isCorrect = true;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                    + "Correct answer was '" + result + "'.\n"
                    + "Let's try again, " + Cli.getUserName() + "!");
        }
        return isCorrect;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }
}
