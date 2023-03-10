package Arrays;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random();
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10);
        }
        System.out.println("The Random Array is" + " " + Arrays.toString(Arrays.stream(num).toArray()));
        for (int numbers : num) {
            map.putAll(duplicateNumbers(num, numbers));
        }
        System.out.println(map);
    }

    private static Map<Integer, Integer> duplicateNumbers(int[] num, int number) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int numbers : num) {
            if (numbers == number) {
                count++;
            }
            map.put(number, count);
        }
        if (map.get(number) == 1) {
            integerMap.put(number, count);
        }
        return integerMap;
    }
}