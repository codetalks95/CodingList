package CodingExamples;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class MortageEMICalculator {
    private static final int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        double principal = random.nextDouble(100000);
        double annualInterestRate = random.nextDouble(30);
        double termInYears = random.nextDouble(10);
        scanner.close();

        double principalPayment = Math.round(principal);
        double monthlyInterestRate = Math.round(annualInterestRate / MONTHS_IN_YEAR);
        double numberOfPayments = Math.round(termInYears * MONTHS_IN_YEAR);
        System.out.println("Principal is" + " " + principalPayment + " " + "rate is" + " " + monthlyInterestRate + " " + "time is" + " " + numberOfPayments);
        System.out.println(calculateEMI(principalPayment, monthlyInterestRate, numberOfPayments));
    }

    private static String calculateEMI(double principal, double monthlyInterestRate, double terms) {
        double monthlyPayment = principal * ((monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, terms))) / ((Math.pow(1 + monthlyInterestRate, terms)) - 1));
        return NumberFormat.getCurrencyInstance().format(Math.round(monthlyPayment));
    }
}
