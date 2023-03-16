package Area;

import java.util.Random;

public class Parallelogram {
    public static void main(String[] args) {
        Random random = new Random();
        int base = random.nextInt(10);
        int height = random.nextInt(10);
        System.out.println("Area Of Parallelogram having" + " " + base + " " + "and" + " " + height + " " + "is" + " " + areaOfParallelogram(base, height));
    }

    private static double areaOfParallelogram(int base, int height) {
        return base*height;
    }
}
