package hexlet.code.items.games;

import hexlet.code.Cli;
import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class GCD implements Game {

    private String nameItem = "GCD";
    private int numberItem = 4;
    private int[] operands;
    private String userAnswer;
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
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    public final void generate(int range) {
        operands = new int[]{RandomUtils.nextInt(1, range), RandomUtils.nextInt(1, range)};

        result = getGCD(operands[0], operands[1]);
    }

    @Override
    public final void ask() {
        System.out.println("Question: " + operands[0] + " " + operands[1]);
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

    private int getGCD(int a, int b) {
        return Math.max(a, b) % Math.min(a, b) == 0 ? b : getGCD(b, a % b);
    }
}
