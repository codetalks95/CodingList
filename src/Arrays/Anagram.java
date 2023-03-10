package Arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "Care";
        String value = "Race";
        if (anagram(str, value)) {
            System.out.println(anagram(str, value) + " " + "this are Anagrams");
        } else {
            System.out.println(anagram(str, value) + " " + "this are not Anagrams");
        }
    }

    private static boolean anagram(String str, String value) {
        if (str.length() == value.length()) {
            char[] chars = str.toLowerCase().toCharArray();
            char[] chars1 = value.toLowerCase().toCharArray();
            Arrays.sort(chars);
            Arrays.sort(chars1);
            return Arrays.equals(chars, chars1);
        }
        return false;
    }
}
