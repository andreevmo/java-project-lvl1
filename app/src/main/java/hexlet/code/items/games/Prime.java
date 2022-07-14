package hexlet.code.items.games;

import hexlet.code.Cli;
import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class Prime implements Game {

    private String nameItem = "Prime";
    private int numberItem = 6;
    private int[] operands;
    private String userAnswer;
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
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public final void generate(int range) {
        operands = new int[]{RandomUtils.nextInt(1, range)};
    }

    @Override
    public final void ask() {
        System.out.println("Question: " + operands[0]);
    }

    @Override
    public final void getAnswer() {
        System.out.print("Your answer: ");
        userAnswer = new Scanner(System.in).nextLine();
    }

    @Override
    public final boolean checkAnswer() {
        boolean isCorrect = true;

        if (isPrime(operands[0]) && userAnswer.equals("yes")) {
            System.out.println("Correct!");
        } else if (!(isPrime(operands[0])) && userAnswer.equals("no")) {
            System.out.println("Correct!");
        } else {
            String correctAnswer = isPrime(operands[0]) ? "yes" : "no";
            System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                    + "Correct answer was '" + correctAnswer + "'.\n"
                    + "Let's try again, " + Cli.getUserName() + "!");
            isCorrect = false;
        }
        return isCorrect;
    }

    private boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
