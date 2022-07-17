package hexlet.code.games;

public class Prime {

    public static final String NAME_ITEM = "Prime";
    public static final int NUMBER_ITEM = 6;

    public static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String getResult(String question) {
        int number = Integer.parseInt(question.trim());
        if (number == 1) {
            return "no";
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
