package CodingExamples;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageEMICalculator {
    private static final int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount:?");
        double principal = scanner.nextDouble();
        System.out.println("Enter the annual interest rate:?");
        float annualInterestRate = scanner.nextFloat();
        System.out.println("Enter the term in years:?");
        int termInYears = scanner.nextInt();
        scanner.close();

        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR;
        int numberOfPayments = termInYears * MONTHS_IN_YEAR;
        System.out.println(calculateEMI(principal, monthlyInterestRate, numberOfPayments));
    }

    private static String calculateEMI(double principal, double monthlyInterestRate, double terms) {
        double monthlyPayment = principal * ((monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, terms))) / ((Math.pow(1 + monthlyInterestRate, terms)) - 1));
        return NumberFormat.getCurrencyInstance().format(Math.round(monthlyPayment));
    }
}
