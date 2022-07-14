package hexlet.code;

import hexlet.code.items.games.Game;

public class Engine {

    private static int amountGames = 3;
    private static int rangeForGenerate = 50;
    public static void start(Game game) {

        game.greet();

        for (int i = 0; i < amountGames; i++) {
            game.generate(rangeForGenerate);
            game.ask();
            game.getAnswer();
            if (!(game.checkAnswer())) {
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");

    }

}
