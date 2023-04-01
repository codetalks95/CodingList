package CodingBat.Map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordMultiple {
    public static void main(String[] args) {
        String[] str = {"a", "b", "a", "c", "b"};
        System.out.println("Word Multiple Logic Map Results are" + " " + wordMultipleLogic(str));
    }

    public static Map<String, Boolean> wordMultipleLogic(String[] strings) {
        Map<String, Integer> stringIntegerHashMap = new HashMap<>();
        boolean[] visited = new boolean[strings.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < strings.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < strings.length; j++) {
                if (Objects.equals(strings[i], strings[j])) {
                    visited[j] = true;
                    count++;
                }
            }
            stringIntegerHashMap.put(strings[i], count);
        }
        return wordMultipleLogic(stringIntegerHashMap);
    }

    public static Map<String, Boolean> wordMultipleLogic(Map<String, Integer> stringIntegerHashMap) {
        Map<String, Boolean> stringBooleanMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : stringIntegerHashMap.entrySet()) {
            if (entry.getValue() == 2) {
                stringBooleanMap.put(entry.getKey(), true);
            } else {
                stringBooleanMap.put(entry.getKey(), false);
            }
        }
        return stringBooleanMap;
    }
}