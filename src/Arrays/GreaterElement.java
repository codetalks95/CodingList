package Arrays;

import java.util.Arrays;
import java.util.Random;

public class GreaterElement {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
        greaterElements(ints);
        System.out.println(Arrays.toString(Arrays.stream(ints).toArray()));
    }

    private static void greaterElements(int[] ints) {
        Arrays.sort(ints);
        System.out.println(ints[ints.length - 1]);
    }
}
