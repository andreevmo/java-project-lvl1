package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void makeWelcome() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
    }

}
