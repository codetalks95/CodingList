package CodingBat.Functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Doubling {
    public static void main(String[] args) {
        int[] num = new int[5];
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10);
        }
        System.out.println("Random Number is" + " " + Arrays.toString(Arrays.stream(num).toArray()));
        System.out.println("Doubling Function is::" + " " + doublingLogic(num));
    }

    private static List<Integer> doublingLogic(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (int j : num) {
            int i1 = j * 2;
            integerList.add(i1);
        }
        return integerList;
    }
}
