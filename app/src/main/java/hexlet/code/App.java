package hexlet.code;

import java.util.Scanner;

public class App {

    private static boolean isOn = true;

    public static void setIsOn(boolean status) {
        isOn = status;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (isOn) {
            System.out.println("Please enter the game number and press Enter.");
            Menu.showMenu();
            System.out.print("Your choice: ");
            int userChoice = Integer.parseInt(scanner.nextLine());
            Menu.openGame(userChoice);

        }
    }
}
