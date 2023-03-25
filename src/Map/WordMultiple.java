package Map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class WordMultiple {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "c", "b"};
        System.out.println("The new Generated HashMap is" + " " + wordMultiple(arr));
    }

    private static Map<String, Integer> wordMultiple(String[] arr) {
        ConcurrentHashMap<String, Integer> integerMap = new ConcurrentHashMap<>();
        if (!allElementsTheSame(arr)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int count = 1;
                    if (arr[i].equals(arr[j])) {
                        count++;
                        integerMap.put(arr[i], count);
                    }
                }
            }
        } else {
            integerMap.put(arr[0], arr.length);
        }
        System.out.println(integerMap);
        return removeFromMap(integerMap);
    }

    public static Map<String, Integer> removeFromMap(ConcurrentHashMap<String, Integer> integerMap) {
        for (Map.Entry<String, Integer> entry : integerMap.entrySet()) {
            if (entry.getValue() < 2) {
                integerMap.remove(entry.getKey());
            }
        }
        return integerMap;
    }

    public static boolean allElementsTheSame(String[] array) {
        Set<String> uniqueValues = new HashSet<>(Arrays.asList(array));
        return uniqueValues.size() == 1;
    }
}