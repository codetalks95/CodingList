package CodingBat.Maps;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static void main(String[] args) {
        String[] str = {"man", "moon", "good", "night"};
        System.out.println("HashMap Results are" + " " + pairs(str));
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> integerMap = new HashMap<>();
        for (String str : strings) {
            integerMap.put(String.valueOf(str.charAt(0)), str.substring(str.length() - 1));
        }
        return integerMap;
    }
}