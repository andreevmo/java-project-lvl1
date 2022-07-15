package hexlet.code.games;

public class Even implements Game {

    public static final String NAME_ITEM = "Even";
    public static final int NUMBER_ITEM = 2;
    private static final String RULE = "Answer 'yes' if number even otherwise answer 'no'.";

    @Override
    public final String getRULE() {
        return RULE;
    }

    @Override
    public final int getNumItem() {
        return NUMBER_ITEM;
    }

    @Override
    public final String getNameItem() {
        return NAME_ITEM;
    }

    public final String getResult(String question) {
        return Integer.parseInt(question.trim()) % 2 == 0 ? "yes" : "no";
    }

}
