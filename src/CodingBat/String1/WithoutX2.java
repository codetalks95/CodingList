package CodingBat.String1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WithoutX2 {
    public static void main(String[] args) {
        String str = "xxHi";
        System.out.println("Result of WithoutX2 logic is" + " " + withoutX2Logic(str));
    }

    private static String withoutX2Logic(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> characterList = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.toCharArray().length; i++) {
            characterList.add(ch[i]);
        }
        for (int i = 0; i < characterList.size(); i++) {
            if (characterList.get(i) == 'x') {
                indexList.add(i);
            }
        }
        Collections.reverse(indexList);
        for (Integer index : indexList) {
            characterList.remove((int) index);
        }
        for (Character character : characterList) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}