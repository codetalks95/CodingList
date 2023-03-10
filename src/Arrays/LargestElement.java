package Arrays;

import java.util.Arrays;
import java.util.Random;

public class LargestElement {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10);
        }
        System.out.println("The Random Array is" + " " + Arrays.toString(Arrays.stream(num).toArray()));
        System.out.println(largestElement(num));
    }

    private static int largestElement(int[] num) {
        boolean isBooleanSwapped = true;
        while (isBooleanSwapped) {
            isBooleanSwapped = false;
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {
                    isBooleanSwapped = true;
                    int temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
        }
        return num[num.length - 1];
    }
}
