package hexlet.code.games;

public class Even implements Game {

    public static final String NAME_ITEM = "Even";
    public static final int NUMBER_ITEM = 2;
    private static int[] operands;
<<<<<<< Updated upstream
    private static String result;
    private static final String RULE = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void start() {

        Engine.sayHello(RULE);

        for (int i = 0; i < Engine.AMOUNT_GAMES; i++) {

            generate(Engine.RANGE_FOR_GENERATE);

            ask();

            String userAnswer = Engine.getAnswer();

            if (!(Engine.checkAnswer(result, userAnswer))) {
                return;
            }
        }
=======
    private static final String RULE = "Answer 'yes' if number even otherwise answer 'no'.";

>>>>>>> Stashed changes

    @Override
    public final String getRULE() {
        return RULE;
    }

<<<<<<< Updated upstream
    public static void generate(int range) {
        operands = new int[]{RandomUtils.nextInt(1, range)};
        result = isEven(operands[0]) ? "yes" : "no";
=======
    @Override
    public final int getNumItem() {
        return NUMBER_ITEM;
>>>>>>> Stashed changes
    }

    @Override
    public final String getNameItem() {
        return NAME_ITEM;
    }

    public final String getResult(String question) {
        return Integer.parseInt(question.trim()) % 2 == 0 ? "yes" : "no";
    }

}
