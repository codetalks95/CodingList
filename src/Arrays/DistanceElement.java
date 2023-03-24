package Arrays;

import java.util.Arrays;
import java.util.Random;

public class DistanceElement {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(Arrays.stream(ints).toArray()));
        System.out.println("Distance Between Element is:-" + " " + distanceBetweenElement(ints));
    }

    private static int distanceBetweenElement(int[] ints) {
        int number = 0;
        int nextNum = new Random().nextInt(ints.length);
        int nextNumber = ints[nextNum];
        System.out.println("Next Number is" + " " + nextNumber);
        int prevNum = new Random().nextInt(ints.length);
        int previousNumber = ints[prevNum];
        System.out.println("Previous Number is" + " " + previousNumber);
        number = nextNumber - previousNumber;
        return number;
    }
}