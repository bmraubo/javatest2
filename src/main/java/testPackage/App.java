package testPackage;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println(helloWorld());
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println(helloName(userName));
        System.out.println("What is your age?");
        String userAge = scanner.nextLine();
        System.out.println(yourAge(userAge));
    }

    public static String helloWorld() {
        return "Hello World!";
    }

    public static String helloName(String testName) {
        return "Hello "+testName;
    }

    public static String yourAge(String age) {
        return String.format("You are %s years old", age);
    }
}
