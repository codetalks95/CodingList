package CodingBat.Map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public static void main(String[] args) {
        String[] str = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println("HashMap for All Swap result is" + "  " + Arrays.toString(allSwap(str)));
    }

    public static String[] allSwap(String[] strings) {
        String[] result = new String[strings.length];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(0);
            if (map.containsKey(c)) {
                int p = map.get(c);
                map.remove(c);
                result[i] = result[p];
                result[p] = strings[i];
            } else {
                result[i] = strings[i];
                map.put(c, i);
            }
        }
        return result;
    }
}
