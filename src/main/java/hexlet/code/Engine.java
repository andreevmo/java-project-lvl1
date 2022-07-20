package hexlet.code;

public class Engine {

    public static void start(String rule, String[] question, String[] result, String userName) {
        System.out.println(rule);
        for (int numGame = 0; numGame < Utils.AMOUNT_GAMES; numGame++) {
            System.out.println("Question: " + question[numGame]);
            String userAnswer = Utils.getAnswer();
            if (!(Utils.checkAnswer(userAnswer, result[numGame], userName))) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
