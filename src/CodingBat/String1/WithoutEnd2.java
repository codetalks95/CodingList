package CodingBat.String1;

import java.util.ArrayList;
import java.util.List;

public class WithoutEnd2 {
    public static void main(String[] args) {
        String base = "Hello";
        System.out.println("RemoveFirstAndLastLogic result is::" + " " + removeFirstAndLastLogic(base));
    }

    private static String removeFirstAndLastLogic(String base) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> characterList = new ArrayList<>();
        char[] ch = base.toCharArray();
        if(ch.length>=2) {
            for (char c : ch) {
                characterList.add(c);
            }
            characterList.remove(0);
            characterList.remove(characterList.size() - 1);
            for (Character character : characterList) {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }
}
