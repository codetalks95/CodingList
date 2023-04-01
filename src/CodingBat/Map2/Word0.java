package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class Word0 {
    public static void main(String[] args) {
        String[] str = {"hello","welcome"};
        System.out.println("HashMap Results are" + " " + word0Implementation(str));
    }

    public static Map<String, Integer> word0Implementation(String[] strings) {
        Map<String, Integer> integerMap = new HashMap<>();
        for (String s : strings) {
            for (char c : s.toCharArray()) {
                integerMap.put(String.valueOf(c), 0);
            }
        }
        return integerMap;
    }
}