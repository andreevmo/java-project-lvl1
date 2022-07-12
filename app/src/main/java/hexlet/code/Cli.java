package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String userName = "user";

    public static String getUserName() {
        return userName;
    }

    public static void makeWelcome() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}
