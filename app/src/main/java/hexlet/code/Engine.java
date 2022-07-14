package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int AMOUNT_GAMES = 3;
    public static final int RANGE_FOR_GENERATE = 50;

    public static String getAnswer() {
        System.out.print("Your answer: ");
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkAnswerInt(int result, String userAnswer) {

        boolean correctUserInput = new Scanner(userAnswer).hasNextInt();
        if (correctUserInput && result == Integer.parseInt(userAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                    + "Correct answer was '" + result + "'.\n"
                    + "Let's try again, " + Cli.getUserName() + "!");
        }
        return false;
    }

    public static boolean checkAnswerString(boolean result, String userAnswer) {

        if (result && userAnswer.equals("yes")) {
            System.out.println("Correct!");
        } else if (!result && userAnswer.equals("no")) {
            System.out.println("Correct!");
        } else {
            String correctAnswer = result ? "yes" : "no";
            System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                    + "Correct answer was '" + correctAnswer + "'.\n"
                    + "Let's try again, " + Cli.getUserName() + "!");
            return false;
        }
        return true;
    }
}
