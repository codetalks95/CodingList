package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DistanceElement {
    public static void main(String[] args) {

        int[] ints = new int[10];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(Arrays.stream(ints).toArray()));
        System.out.println("Enter the First Number");
        int previousNumber = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int nextNumber= scanner.nextInt();

        distanceBetweenElement(ints,previousNumber,nextNumber);
    }

    private static int distanceBetweenElement(int[] ints ,int previousNumber, int nextNumber) {
        for (int i = 0; i < ints.length ; i++) {

        }
        return previousNumber;
    }
}