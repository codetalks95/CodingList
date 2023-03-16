package ProgramOnDateTimeYear;

import java.util.Random;

public class ConvertDaysToYearMonthDays {
    public static void main(String[] args) {
        Random random = new Random();
        int days = random.nextInt(1000);
        System.out.println("Random Number is:" + " " + days);
        getDateYearDays(days);
    }

    private static void getDateYearDays(int days) {
        int year = 0, months = 0, remainingDays = 0, daysValue = 0;
        if (days > 365) {
            year = days / 365;
            remainingDays = days - year * 365;
        } else {
            remainingDays = days;
        }
        if (remainingDays >= 30) {
            months = remainingDays / 30;
            daysValue = remainingDays - months * 30;
        }
        if (remainingDays < 30) {
            daysValue = remainingDays;
        }
        System.out.println("Year Month Days is:" + "" + year + " " + months + " " + daysValue);
    }
}