package recursion;

import java.util.Scanner;

public class RecursionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number?");
        int number = scanner.nextInt();
        System.out.println(multiplication(number));
    }

    public static int multiplication(int values) {
        if (values > 0) {
            return values - multiplication(values - 1);
        }
        return 0;
    }
}
