package CodingBat.Functional2;

import java.util.ArrayList;
import java.util.List;

public class NoLong {
    public static void main(String[] args) {
        String[] str = {"this", "not", "too", "long"};
        System.out.println("NoLong Logic result is::" + noLongLogic(str));
    }

    private static List<String> noLongLogic(String[] str) {
        List<String> stringList = new ArrayList<>();
        List<String> unWantedList = new ArrayList<>();
        for (String s : str) {
            if (s.length() >= 4) {
                unWantedList.add(s);
            } else {
                stringList.add(s);
            }
        }
        return stringList;
    }
}

