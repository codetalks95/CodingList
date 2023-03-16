package Area;

import java.util.Random;

public class Rhombus {
    public static void main(String[] args) {
        Random random = new Random();
        int diagonal1 = random.nextInt(10);
        int diagonal2 = random.nextInt(10);
        System.out.println("Area Of Rhombus having" + " " + diagonal1 + " " + "and" + " " + diagonal2 + " " + "is" + " " + areaOfRhombus(diagonal1, diagonal2));
    }

    private static double areaOfRhombus(int diagonal1, int diagonal2) {
        return diagonal1 * diagonal2 / 2;
    }
}
