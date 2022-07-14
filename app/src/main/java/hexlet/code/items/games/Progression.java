package hexlet.code.items.games;

import hexlet.code.Cli;
import java.util.Scanner;
import org.apache.commons.lang3.RandomUtils;

public class Progression implements Game {

    private String nameItem = "Progression";
    private int numberItem = 5;
    private int[] operands;
    private String progression;
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
        System.out.println("What number is missing in the progression?");
    }

    @Override
    public final void generate(int range) {

        int firstProgressionsElement = RandomUtils.nextInt(1, range);
        int stepInProgressions = RandomUtils.nextInt(1, range);
        int progressionsSize = 10;
        int missingElementIndex = RandomUtils.nextInt(0, progressionsSize);

        operands = new int[progressionsSize];
        progression = "";

        for (int i = 0; i < progressionsSize; i++) {
            if (i == 0) {
                operands[0] = firstProgressionsElement;
            } else {
                operands[i] = operands[i - 1] + stepInProgressions;
            }

            if (i == missingElementIndex) {
                progression += ".. ";
            } else {
                progression += operands[i] + " ";
            }
        }

        result = operands[missingElementIndex];
    }

    @Override
    public final void ask() {
        System.out.println("Question: " + progression.trim());
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
}
