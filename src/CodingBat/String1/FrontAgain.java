package CodingBat.String1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FrontAgain {
    public static void main(String[] args) {
        String str = "edited";
        System.out.println("FrontEnd Logic result is::" + " " + frontAgainLogic(str));
    }

    private static boolean frontAgainLogic(String str) {
        List<String> stringList = new ArrayList<>();
        List<String> stringListValue = new ArrayList<>();
        char[] ch = str.toCharArray();
        if (ch.length >= 4) {
            stringList.add(String.valueOf(ch[0]));
            stringList.add(String.valueOf(ch[1]));
            stringListValue.add(String.valueOf(ch[ch.length - 1]));
            stringListValue.add(String.valueOf(ch[ch.length - 2]));
            System.out.println(stringList);
            System.out.println(stringListValue);
        } else {
            System.out.println("Length of Array is not sufficient to determine anything");
        }
        return new HashSet<>(stringList).containsAll(stringListValue);
    }
}