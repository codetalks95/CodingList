package CodingBat.String1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Concat {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cat";
        System.out.println("Result of Concat logic is" + " " + concatLogic(str1, str2));
    }

    private static String concatLogic(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        List<Character> characterList1 = IntStream.range(0, ch1.length).mapToObj(i -> ch1[i]).collect(Collectors.toList());
        List<Character> characterList2 = IntStream.range(0, ch2.length).mapToObj(i -> ch2[i]).collect(Collectors.toList());

        if (characterList1.get(characterList1.size() - 1) == characterList2.get(0)) {
            characterList1.remove(characterList1.size() - 1);
            characterList2.remove(characterList2.get(0));
        }
        for (Character character : characterList1) {
            stringBuilder.append(character);
        }
        for (Character character : characterList2) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}