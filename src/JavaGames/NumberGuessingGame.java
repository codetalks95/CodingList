package JavaGames;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(100);
        System.out.println("The Lottery Number is" + " " + rand);
        numberGuess(rand);
    }

    private static void numberGuess(int rand) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (count == 1) {
                System.out.println("Enter the Number You Think it is the Lottery Number?");
            } else {
                System.out.println("Try Again and Assume Your Luck?");
            }
            int scan = scanner.nextInt();
            count++;
            if (scan == rand) {
                System.out.println("Congrats you have achieved the goal in" + " " + count + " " + "attempt");
                System.out.println("Yay You Won the Lottery");
                break;
            } else {
                if (scan > rand) {
                    System.out.println("The Number is Greater then the Lottery Number");
                } else {
                    System.out.println("The Number is less then the Lottery Number");
                }
            }
        }
    }
}
