package SimpleJavaPrograms;

import java.util.Random;

public class ReverseNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Random Number is:" + " " + number);
        System.out.println("ReversedNumber" + " " + Integer.parseInt(reverseNumber(number)));
    }

    private static String reverseNumber(int number) {
        String str = String.valueOf(number);
        StringBuilder reverseString = new StringBuilder();
        int size = str.length();
        for (int i = size - 1; i >= 0; i--) {
            reverseString.append(str.charAt(i));
        }
        return reverseString.toString();
    }
}

