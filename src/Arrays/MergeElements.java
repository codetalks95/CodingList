package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MergeElements {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(5);
        }
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(5);
        }
        System.out.println("The Number Array for Num" + " " + Arrays.toString(Arrays.stream(num).toArray()));
        System.out.println("The Number Array for Number" + " " + Arrays.toString(Arrays.stream(number).toArray()));
        System.out.println("Merged Elements are" + " " + mergeElements(num, number));
    }

    private static List<Integer> mergeElements(int[] num, int[] number) {
        List<Integer> integerList = new ArrayList<>();
        for (int k : num) {
            integerList.add(k);
        }
        for (int j : number) {
            integerList.add(j);
        }
        return integerList;
    }
}
