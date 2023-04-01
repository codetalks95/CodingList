package CodingBat.String1;

import java.util.HashMap;
import java.util.Map;

public class CountTriple {
    public static void main(String[] args) {
        String str = "aaaXXXccc";
        System.out.println("Count of the Number is" + " " + "" + countTripe(str));
    }

    private static Map<Character, Integer> countTripe(String str) {
        int count = 0;
        Map<Character, Integer> integerMap = new HashMap<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < 7; i++) {
            if (ch[i] == ch[i + 1] && ch[i + 1] == ch[i + 2]) {
                integerMap.put(ch[i], count + 1);
                if (integerMap.get(ch[i]) == ch[i]) {
                    count++;
                    integerMap.put(ch[i], count);
                }
            }
        }
        return integerMap;
    }
}
