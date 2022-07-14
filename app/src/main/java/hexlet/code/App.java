package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n"
                + Even.NUMBER_ITEM + " - " + Even.NAME_ITEM + "\n"
                + Calc.NUMBER_ITEM + " - " + Calc.NAME_ITEM + "\n"
                + GCD.NUMBER_ITEM + " - " + GCD.NAME_ITEM + "\n"
                + Progression.NUMBER_ITEM + " - " + Progression.NAME_ITEM + "\n"
                + Prime.NUMBER_ITEM + " - " + Prime.NAME_ITEM + "\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        String userChoice = new Scanner(System.in).nextLine();
        userChoice = new Scanner(userChoice).hasNextInt() ? userChoice : "0";
        switch (Integer.parseInt(userChoice)) {
            case 1 -> Cli.makeWelcome();
            case Even.NUMBER_ITEM -> Even.start();
            case Calc.NUMBER_ITEM -> Calc.start();
            case GCD.NUMBER_ITEM -> GCD.start();
            case Progression.NUMBER_ITEM -> Progression.start();
            case Prime.NUMBER_ITEM -> Prime.start();
            default -> System.out.print("");
        }

    }
}
