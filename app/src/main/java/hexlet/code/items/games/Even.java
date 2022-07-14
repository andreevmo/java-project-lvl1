package hexlet.code.items.games;

import java.util.Scanner;
import hexlet.code.Cli;
import org.apache.commons.lang3.RandomUtils;

public class Even implements Game {

    private String nameItem = "Even";
    private String userAnswer;
    private int numberItem = 2;
    private int[] operands;
    private int result;

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
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    @Override
    public final void generate() {

        operands = new int[]{RandomUtils.nextInt(1, 100)};
        result = operands[0] % 2;
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

        if (result == 0 && userAnswer.equals("yes")) {
            System.out.println("Correct!");
        } else if (result != 0 && userAnswer.equals("no")) {
            System.out.println("Correct!");
        } else {
            String correctAnswer = userAnswer.equals("yes") ? "no" : "yes";
            System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                    + "Correct answer was '" + correctAnswer + "'.\n"
                    + "Let's try again, " + Cli.getUserName() + "!");
            isCorrect = false;
        }
        return isCorrect;
    }
}
