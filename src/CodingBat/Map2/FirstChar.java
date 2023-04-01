package CodingBat.Map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public static void main(String[] args) {
        System.out.println("HashMap Results are" + " " + pairsMap(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
    }

    public static Map<String, String> pairsMap(String[] strings) {
        System.out.println("Arrays are" + " " + Arrays.toString(Arrays.stream(strings).toArray()));
        Map<String, String> integerMap = new HashMap<>();
        String str;
        for (int i = 0; i < strings.length; i++) {
            if (i == strings.length - 1) {
                integerMap.put(String.valueOf(strings[i].charAt(0)), String.valueOf(strings[strings.length - 1]));
            }
            for (int j = i + 1; j < strings.length; j++) {
                str = strings[i] + strings[j];
                if (strings[i].charAt(0) == strings[j].charAt(0)) {
                    integerMap.put(String.valueOf(strings[i].charAt(0)), str);
                } else {
                    integerMap.put(String.valueOf(strings[i].charAt(0)), strings[i]);
                }
            }
        }
        return integerMap;
    }
}