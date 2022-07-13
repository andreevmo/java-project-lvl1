package hexlet.code;

public class Engine {

    private static int amountGames = 3;
    public static void start(Game game) {

        game.greet();

        for (int i = 0; i < amountGames; i++) {
            game.generate();
            game.ask();
            game.getAnswer();
            if (!(game.checkAnswer())) {
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");

    }

}
