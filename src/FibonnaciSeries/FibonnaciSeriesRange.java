package FibonnaciSeries;

import java.util.Random;

public class FibonnaciSeriesRange {
    public static void main(String[] args) {
        Random random = new Random();
        int range = random.nextInt(100);
        fibbonaciSeriesRange(range);
    }

    private static void fibbonaciSeriesRange(int range) {
        int a, b = 0, c = 1;
        for (int i = 1; i <= range; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + " ");
        }
    }
}
