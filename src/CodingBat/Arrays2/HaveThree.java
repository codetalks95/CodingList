package CodingBat.Arrays2;

import java.util.*;

public class HaveThree {
    public static void main(String[] args) {
        Integer[] num = {1, 7, 1, 8, 7, 1};
        System.out.println("Have3 result Logic is::" + have3Logic(num));
    }

    private static boolean have3Logic(Integer[] num) {
        Map<Integer, Integer> integerIntegerMap = countDigitFrequency(num);
        for (Map.Entry<Integer, Integer> entry : integerIntegerMap.entrySet()) {
            if (entry.getValue() == 3 && entry.getKey() == 1) {
                return true;
            }
        }
        return false;
    }

    public static Map<Integer, Integer> countDigitFrequency(Integer[] num) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        List<Integer> ints = Arrays.asList(num);
        for (int item : num) {
            int frequency = Collections.frequency(ints, item);
            integerIntegerMap.put(item, frequency);
        }
        return integerIntegerMap;
    }
}
