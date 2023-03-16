package ProgramOnDateTimeYear;

import java.util.Random;

public class ExtractLastDigit {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10000);
        System.out.println("Random Number is:" + " " + number);
        System.out.println("ExtractedLastTwoDigit" + " " + extractLastTwoDigit(number));
    }

    private static Integer extractLastTwoDigit(int number) {
        return Integer.parseInt(String.valueOf(number).substring(2));
    }
}
