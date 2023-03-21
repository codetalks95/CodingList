package CodingBat.Maps;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String[] str = {"man", "moon", "BooksAndShapes", "night"};
        System.out.println("HashMap Results are" + " " + wordCount(str));
    }

    public static Map<Character, Integer> wordCount(String[] strings) {
        Map<Character, Integer> integerMap = new HashMap<>();
        for (String str : strings) {
            Map<Character, Integer> integerMaps = new HashMap<>();
            integerMaps = frequencyOfCharacter(str);
            integerMap.putAll(integerMaps);
        }
        return integerMap;
    }

    public static Map<Character, Integer> frequencyOfCharacter(String str) {
        Map<Character, Integer> integerMap = new HashMap<>();
        int count = 1;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    integerMap.put(ch[i], count);
                }
            }
        }
        return integerMap;
    }
}