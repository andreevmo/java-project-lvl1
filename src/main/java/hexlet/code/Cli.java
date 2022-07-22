package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void makeWelcome() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
