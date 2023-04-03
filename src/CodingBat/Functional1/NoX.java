package CodingBat.Functional1;

import java.util.ArrayList;
import java.util.List;

public class NoX {
    public static void main(String[] args) {
        String[] str = {"ax", "bb", "cx"};
        System.out.println("NoXLogic result is::" + " " + noXLogic(str));
    }

    private static List<String> noXLogic(String[] str) {
        List<String> stringList = new ArrayList<>();
        for (String s : str) {
            if (!s.contains("x")) {
                stringList.add(s);
            }
        }
        return stringList;
    }
}