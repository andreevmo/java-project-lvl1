package hexlet.code;

import java.util.Scanner;
import org.apache.commons.lang3.RandomUtils;

public class Even implements Item {

    private String name = "Even";
    private int num = 2;

    private int countQuestion = 3;

    @Override
    public void start() {

        Cli.makeWelcome();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (int i = 1; i <= countQuestion; i++) {

            int rangeNumForQuestion = 100;
            int numForQuestion = RandomUtils.nextInt(1, rangeNumForQuestion);
            System.out.println("Question: " + numForQuestion);

            System.out.print("Your answer: ");
            String userAnswer = new Scanner(System.in).nextLine();

            if (numForQuestion % 2 == 0 && userAnswer.equals("yes")) {
                System.out.println("Correct!");
            } else if (numForQuestion % 2 != 0 && userAnswer.equals("no")) {
                System.out.println("Correct!");
            } else {
                String correctAnswer = userAnswer.equals("yes") ? "no" : "yes";
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + Cli.getUserName() + "!");
                break;
            }

            if (i == countQuestion) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
        finish();
    }

    @Override
    public int getNumItem() {
        return this.num;
    }

    @Override
    public String getNameItem() {
        return this.name;
    }

    @Override
    public void finish() {
        App.setIsOn(false);
    }
}
