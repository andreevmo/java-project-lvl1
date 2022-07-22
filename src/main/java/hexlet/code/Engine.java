package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void start(String rule, String[][] questionsAndResults) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);
        for (int numGame = 0; numGame < Utils.AMOUNT_GAMES; numGame++) {
            System.out.println("Question: " + questionsAndResults[Utils.QUESTION][numGame]);
            String userAnswer = Utils.getAnswer();
            if (!(userAnswer.equals(questionsAndResults[Utils.RESULT][numGame]))) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + questionsAndResults[Utils.RESULT][numGame] + "'.\n"
                        + "Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
