package SimpleJavaPrograms;

import java.util.Random;

public class NCubeNumber {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Random Number is:" + random.nextInt(10));
        System.out.println(NCube(random.nextDouble()));
    }

    private static Double NCube(double ints) {
        double i = (15.0 * (15.0 + 1) / 2);
        return Math.pow(i, 2);
    }
}

