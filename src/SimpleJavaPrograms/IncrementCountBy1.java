package SimpleJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class IncrementCountBy1 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(Arrays.stream(ints).toArray()));
        System.out.println(incrementBy1(ints));
    }

    private static List<Integer> incrementBy1(int[] ints) {
        List<Integer> integerList = new ArrayList<>();
        for (int anInt : ints) {
            integerList.add(anInt + 1);
        }
        return integerList;
    }
}

