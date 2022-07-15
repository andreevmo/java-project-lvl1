package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int AMOUNT_GAMES = 3;
    public static final int RANGE_FOR_GENERATE = 50;

    public static void sayHello(String rule) {
        Cli.makeWelcome();
        System.out.println(rule);
    }

    public static String getAnswer() {
        System.out.print("Your answer: ");
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkAnswer(String result, String userAnswer) {

        if (userAnswer.equals(result)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                    + "Correct answer was '" + result + "'.\n"
                    + "Let's try again, " + Cli.getUserName() + "!");
        }
        return false;
    }
}
