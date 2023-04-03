package CodingBat.Functional1;

import java.util.ArrayList;
import java.util.List;

public class Lower {
    public static void main(String[] args) {
        String[] str = {"AAA", "BBB", "ccc"};
        System.out.println("Lower result is::" + " " + lowerLogic(str));
    }

    private static List<String> lowerLogic(String[] str) {
        List<String> stringList = new ArrayList<>();
        for (String s : str) {
            String s1 = s.toLowerCase();
            stringList.add(s1);
        }
        return stringList;
    }
}