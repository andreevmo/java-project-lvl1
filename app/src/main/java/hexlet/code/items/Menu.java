package hexlet.code.items;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.items.games.*;

import java.util.Scanner;

public class Menu {

    private Item[] listMenu = new Item[]{new Greet(), new Even(), new Calc(), new GCD(), new Progression(), new Exit()};
    private int userChoice;

    public final void showMenu() {
        System.out.println("Please enter the game number and press Enter.");
        for (Item menu : listMenu) {
            System.out.println(menu.getNumItem() + " - " + menu.getNameItem());
        }
    }

    public final void openGame() {
        System.out.print("Your choice: ");
        userChoice = Integer.parseInt(new Scanner(System.in).nextLine());

        for (Item item : listMenu) {
            if (userChoice == 0) {
                break;
            }

            if (userChoice == item.getNumItem()) {
                if (userChoice == 1) {
                    Cli.makeWelcome();
                } else {
                    Engine.start((Game) item);
                }
                break;
            }
        }
    }
}
