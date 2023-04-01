package CodingBat.String1;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of the Student");
        String name = scanner.nextLine();
        System.out.println("Welcome to Java World" + " " + helloNameLogic(name));
    }

    private static String helloNameLogic(String name) {
        return name;
    }
}
