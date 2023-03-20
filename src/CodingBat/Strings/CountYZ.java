package CodingBat.Strings;

import java.util.ArrayList;
import java.util.List;

public class CountYZ {
    public static void main(String[] args) {
        String[] words = {"fez day"};
        System.out.println(countYZ(words));
    }

    private static int countYZ(String[] words) {
        List<String> stringList = new ArrayList<>();
        for (String word : words) {
            String[] str = word.split(" ");
            for (String s : str) {
                if (s.endsWith("y") || s.endsWith("z")) {
                    stringList.add(s);
                }
            }
        }
        return stringList.size();
    }
}

