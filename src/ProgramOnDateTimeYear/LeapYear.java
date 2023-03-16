package ProgramOnDateTimeYear;

public class LeapYear {
    public static void main(String[] args) {
        int year = generateRandomYear(2020, 2032);
        if (checkLeapYearLogic(year)) {
            System.out.println("Yes" + " " + checkLeapYearLogic(year) + " " + year + " " + "is a leap year");
        } else {
            System.out.println("No" + " " + checkLeapYearLogic(year) + " " + year + " " + "is not a leap year");
        }
    }

    private static boolean checkLeapYearLogic(int year) {
        return year % 400 == 0 || year % 4 == 0;
    }

    public static int generateRandomYear(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}
