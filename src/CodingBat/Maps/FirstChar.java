package CodingBat.Maps;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public static void main(String[] args) {
        System.out.println("HashMap Results are" + " " + pairsMap(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
    }

    public static Map<String, String> pairsMap(String[] strings) {
        Map<String, String> integerMap = new HashMap<>();
        String str, val;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                String[] stringsData = new String[1];
                stringsData[0] = strings[i];
                str = strings[i] + strings[j];
                if (strings[i].charAt(0) == strings[j].charAt(0)) {
                    char ch = strings[i].charAt(0);
                    val = concatCharacterMap(stringsData).get(Character.toString(ch));
                    integerMap.put(String.valueOf(strings[i].charAt(0)), val + str);
                }
            }
        }
        return integerMap;
    }

    public static Map<String, String> concatCharacterMap(String[] strings) {
        Map<String, String> integerMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].charAt(i) == strings[i].charAt(i + 1)) {
                integerMap.put(String.valueOf(strings[i].charAt(0)), String.valueOf(strings[i].charAt(0)));
            }
        }
        return integerMap;
    }

    public static Map<String, String> returnMap(String[] strings) {
        Map<String, String> integerMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].charAt(i) == strings[i].charAt(i + 1)) {
                integerMap.put(String.valueOf(strings[i].charAt(0)), String.valueOf(strings[i].charAt(0)));
            }
        }
        return integerMap;
    }
}