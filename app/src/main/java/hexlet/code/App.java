package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Game[] items = {new Even(), new Calc(), new GCD(), new Progression(), new Prime()};
        showMenu(items);

        System.out.print("Your choice: ");
        String userChoice = new Scanner(System.in).nextLine();
        userChoice = new Scanner(userChoice).hasNextInt() ? userChoice : "0";
        if (userChoice.equals("1")) {
            Cli.makeWelcome();
        } else {
            openGame(items, userChoice);
        }

    }

    public static void showMenu(Game[] items) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        for (Game game : items) {
            System.out.println(game.getNumItem() + " - " + game.getNameItem());
        }
        System.out.println("0 - Exit");
    }

    public static void openGame(Game[] items, String userChoice) {
        for (Game game : items) {
            if (Integer.parseInt(userChoice) == game.getNumItem()) {
                Engine.start(game);
            }
        }
    }
}
