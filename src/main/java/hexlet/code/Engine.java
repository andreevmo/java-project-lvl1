package hexlet.code;

import hexlet.code.games.Utils;

public class Engine {

    public static boolean start(String rule, String question, String result, int numGame) {
        if (numGame == 0) {
            Cli.makeWelcome();
            System.out.println(rule);
        }
        System.out.println("Question: " + question);
        String userAnswer = Utils.getAnswer();
        boolean isWin = Utils.checkAnswer(userAnswer, result);
        if (numGame == 2 && isWin) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
        return isWin;
    }
}
