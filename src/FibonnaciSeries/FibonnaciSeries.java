package FibonnaciSeries;

import java.util.ArrayList;
import java.util.List;

public class FibonnaciSeries {
    public static void main(String[] args) {
        int range = 10;
        fibonnaciSeries(range);
    }

    private static void fibonnaciSeries(int range) {
        int a = 0, b = 0, c = 1;
        System.out.print("Fibonacci Series:");
        for (int i = 1; i <= range; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }
    }
}