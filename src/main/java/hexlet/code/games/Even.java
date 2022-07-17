package hexlet.code.games;

public class Even {

    public static final String NAME_ITEM = "Even";
    public static final int NUMBER_ITEM = 2;
    public static final String RULE = "Answer 'yes' if number even otherwise answer 'no'.";


    public static String getResult(String question) {
        return Integer.parseInt(question.trim()) % 2 == 0 ? "yes" : "no";
    }

}
