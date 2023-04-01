package CodingBat.String1;

import java.util.ArrayList;
import java.util.List;

public class FirstHalf {
    public static void main(String[] args) {
        String[] strings = {"HelloThere"};
        System.out.println("First Half Logic result is::" + " " + firstHalfLogic(strings));
    }

    private static List<String> firstHalfLogic(String[] strings) {
        int index = 0;
        StringBuilder res = new StringBuilder();
        List<String> stringList = new ArrayList<>();
        for (String string : strings) {
            char[] ch = string.toCharArray();
            for (int i = 1; i < ch.length; i++) {
                if (Character.isUpperCase(ch[i])) {
                    index = i;
                }
            }
            for (int i = index - 1; i >= 0; i--) {
                res.append(string.charAt(i));
            }
            stringList.add(String.valueOf(res.reverse()));
        }
        return stringList;
    }
}