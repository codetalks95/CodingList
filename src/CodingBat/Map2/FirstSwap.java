package CodingBat.Map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public static void main(String[] args) {
        String[] str = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println("HashMap for First Swap result is" + "  " + Arrays.toString(firstSwap(str)));
    }

    public static String[] firstSwap(String[] strings) {
        String[] result = new String[strings.length];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(0);
            if (map.containsKey(c) && map.get(c) >= 0) {
                int p = map.get(c);
                map.put(c, -1);
                result[i] = result[p];
                result[p] = strings[i];
            } else {
                result[i] = strings[i];
                if (!map.containsKey(c)) map.put(c, i);
            }
        }
        return result;
    }
}
