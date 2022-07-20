package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        showMenu();
        System.out.print("Your choice: ");
        String userChoice = new Scanner(System.in).nextLine();
        Scanner userInput = new Scanner(userChoice);
        userChoice = userInput.hasNextInt() ? String.valueOf(userInput.nextInt()) : "0";
        openGame(Integer.parseInt(userChoice));

    }

    public static void showMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n"
                + Even.NUMBER_ITEM + " - " + Even.NAME_ITEM + "\n"
                + Calc.NUMBER_ITEM + " - " + Calc.NAME_ITEM + "\n"
                + GCD.NUMBER_ITEM + " - " + GCD.NAME_ITEM + "\n"
                + Progression.NUMBER_ITEM + " - " + Progression.NAME_ITEM + "\n"
                + Prime.NUMBER_ITEM + " - " + Prime.NAME_ITEM + "\n"
                + "0 - Exit");
    }

    public static void openGame(int userChoice) {
        switch (userChoice) {
            case 1 -> Cli.makeWelcome();
            case Even.NUMBER_ITEM -> Even.start(Cli.makeWelcome());
            case Calc.NUMBER_ITEM -> Calc.start(Cli.makeWelcome());
            case GCD.NUMBER_ITEM -> GCD.start(Cli.makeWelcome());
            case Progression.NUMBER_ITEM -> Progression.start(Cli.makeWelcome());
            case Prime.NUMBER_ITEM -> Prime.start(Cli.makeWelcome());
            default -> { }
        }
    }
}
