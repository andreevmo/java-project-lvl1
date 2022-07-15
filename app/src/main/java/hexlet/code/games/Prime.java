package hexlet.code.games;

public class Prime implements Game {

    public static final String NAME_ITEM = "Prime";
    public static final int NUMBER_ITEM = 6;
<<<<<<< Updated upstream
    private static int[] operands;
    private static String result;
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

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

        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    public static void generate(int range) {
        operands = new int[]{RandomUtils.nextInt(1, range)};
        result = isPrime(operands[0]) ? "yes" : "no";
=======
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    @Override
    public final String getRULE() {
        return RULE;
    }

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
        int number = Integer.parseInt(question.trim());
        for (int i = 2; i <= number / 2; i++) {
            if (number == 1 || number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }


}
