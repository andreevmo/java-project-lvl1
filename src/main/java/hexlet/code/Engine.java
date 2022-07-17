package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class Engine {

    public static final int AMOUNT_GAMES = 3;
    public static final int RANGE_FOR_GENERATE = 50;
    private static String question;
    private static String result;
    private static String rule;
    public static void start(int userChoice) {

        Cli.makeWelcome();
        if (userChoice == 1) {
            return;
        }

        for (int i = 0; i < Engine.AMOUNT_GAMES; i++) {
            initialization(userChoice);
            if (i == 0) {
                System.out.println(rule);
            }

            Engine.ask();

            if (!(Engine.checkAnswer(Engine.getAnswer()))) {
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    public static void initialization(int userChoice) {
        question = "";
        switch (userChoice) {
            case Even.NUMBER_ITEM -> {
                rule = Even.RULE;
                question += " " + Engine.generate();
                result = Even.getResult(question);
            }
            case Calc.NUMBER_ITEM -> {
                rule = Calc.RULE;
                question += " " + Calc.generateExpression(question);
                result = Calc.getResult();
            }
            case GCD.NUMBER_ITEM -> {
                rule = GCD.RULE;
                question += " " + GCD.generateExpression(question);
                result = GCD.getResult();
            }
            case Progression.NUMBER_ITEM -> {
                rule = Progression.RULE;
                question += " " + Progression.generateExpression(question);
                result = Progression.getResult();
            }
            case Prime.NUMBER_ITEM -> {
                rule = Prime.RULE;
                question += " " + Engine.generate();
                result = Prime.getResult(question);
            }
            default -> {
            }
        }
    }
    public static int generate() {
        return RandomUtils.nextInt(1, RANGE_FOR_GENERATE);
    }

    public static void ask() {
        System.out.println("Question:" + question);
    }

    public static String getAnswer() {
        System.out.print("Your answer: ");
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkAnswer(String userAnswer) {

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
