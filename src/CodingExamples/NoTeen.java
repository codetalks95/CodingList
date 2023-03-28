package CodingExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NoTeen {
    public static void main(String[] args) {
        int[] num = new int[5];
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(20);
        }
        System.out.println("Random Number is" + " " + Arrays.toString(Arrays.stream(num).toArray()));
        System.out.println("NoTeen Function is::" + " " + noTeen(num));
    }

    private static List<Integer> noTeen(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (int j : num) {
            if (j >= 12 && j <= 19) {
                integerList.add(j);
            }
        }
        return integerList;
    }
}
