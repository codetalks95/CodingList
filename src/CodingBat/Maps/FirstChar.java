package CodingBat.Maps;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public static void main(String[] args) {
        String[] str = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        System.out.println("HashMap Results are" + " " + pairs(str));
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> integerMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].charAt(0) == strings[j].charAt(0)) {
                    integerMap.put(String.valueOf(strings[i].charAt(0)), strings[i] + strings[j]);
                }
            }
        }
        return integerMap;
    }
}