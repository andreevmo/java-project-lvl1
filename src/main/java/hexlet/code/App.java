package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    public static String userChoice;
    public static void main(String[] args) {

        showMenu();
        System.out.print("Your choice: ");
        userChoice = new Scanner(System.in).nextLine();
        userChoice = new Scanner(userChoice).hasNextInt() ? userChoice : "0";
        if (userChoice.equals("0")) {
            return;
        }
        Engine.start(Integer.parseInt(userChoice));
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
}
