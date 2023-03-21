package CodingBat.Maps;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public static void main(String[] args) {
        String[] str = {"this", "and", "that", "and"};
        System.out.println("HashMap Results are" + " " + wordLen(str));
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> integerMap = new HashMap<>();
        for (String str : strings) {
            integerMap.put(str, str.length());
        }
        return integerMap;
    }
}