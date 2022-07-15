package hexlet.code;

import hexlet.code.games.Game;
import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class Engine {

    public static final int AMOUNT_GAMES = 3;
    public static final int RANGE_FOR_GENERATE = 50;

    public static void start(Game game) {

        Engine.sayHello(game.getRULE());

        for (int i = 0; i < Engine.AMOUNT_GAMES; i++) {

            String question = game.generateExpression(" ");

            Engine.ask(question);

            if (!(Engine.checkAnswer(game.getResult(question), Engine.getAnswer()))) {
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
    public static void sayHello(String rule) {
        Cli.makeWelcome();
        System.out.println(rule);
    }

    public static int generate() {
        return RandomUtils.nextInt(1, RANGE_FOR_GENERATE);
    }

    public static void ask(String expression) {
        System.out.println("Question:" + expression);
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
