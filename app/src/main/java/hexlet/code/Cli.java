package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void sayHello() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("May I have your name?");
        var userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
//        scanner.close();
    }



}
