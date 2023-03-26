package CodingBat.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordAppend {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a"};
        System.out.println("The new Generated HashMap is" + " " + wordAppend(arr));
    }

    private static Map<String, String> wordAppend(String[] arr) {
        Map<String, Integer> stringStringMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!checkIfElementExists(stringStringMap, arr[i])) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (Objects.equals(arr[i], arr[j])) {
                        count++;
                        stringStringMap.put(arr[i], count);
                    }
                }
            }
        }
        return appendElement(stringStringMap);
    }

    public static boolean checkIfElementExists(Map<String, Integer> integerMap, String str) {
        return integerMap.containsKey(str);
    }

    public static Map<String, String> appendElement(Map<String, Integer> integerMap) {
        Map<String, String> stringStringMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : integerMap.entrySet()) {
            if (checkIfNumberIsEven(entry.getValue())) {
                stringStringMap.put(entry.getKey(), entry.getKey() + entry.getKey());
            }
        }
        return stringStringMap;
    }

    public static boolean checkIfNumberIsEven(int num) {
        return num % 2 == 0;
    }
}
