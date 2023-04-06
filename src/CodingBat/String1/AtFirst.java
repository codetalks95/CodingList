package CodingBat.String1;

import java.util.ArrayList;
import java.util.List;

public class AtFirst {
    public static void main(String[] args) {
        String strings = "H";
        System.out.println("AtFirst Logic is::" + " " + atFirstLogic(strings));
    }

    private static String atFirstLogic(String strings) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> characterList = new ArrayList<>();
        char[] ch = strings.toCharArray();
        if (ch.length >= 2) {
            for (char c : ch) {
                characterList.add(c);
            }
            for (int i = 0; i < 2; i++) {
                stringBuilder.append(characterList.get(i));
            }
        } else {
            return strings + "@";
        }
        return stringBuilder.toString();
    }
}