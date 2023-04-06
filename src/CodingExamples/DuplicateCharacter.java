package CodingExamples;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String ch = "chaabbcc";
        System.out.println("Duplicate Character in the String::" + "" + duplicateCharacter(ch));
    }

    private static String duplicateCharacter(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        return convertSetToString(set).toString();
    }

    private static StringBuilder convertSetToString(Set<Character> set) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character characters : set) {
            stringBuilder.append(characters);
        }
        return stringBuilder;
    }
}
