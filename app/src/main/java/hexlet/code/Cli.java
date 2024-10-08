package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String userName;

    public static void sayHello() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("May I have your name?");
        userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
//        scanner.close();
    }



}
