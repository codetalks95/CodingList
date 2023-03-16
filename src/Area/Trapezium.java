package Area;

import java.util.Random;

public class Trapezium {
    public static void main(String[] args) {
        Random random = new Random();
        int side = random.nextInt(10);
        int height = random.nextInt(10);
        System.out.println("Area Of Trapezium having" + " " + side + " " + "and" + " " + height + " " + "is" + " " + areaOfTrapezium(side, height));
    }

    private static double areaOfTrapezium(int side, int height) {
        return (side * 2) * height / 2;
    }
}
