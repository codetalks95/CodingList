package CodingExamples;

import java.util.ArrayList;
import java.util.List;

public class ThreeCopies {
    public static void main(String[] args) {
        String[] str = {"a", "bb", "ccc"};
        System.out.println("Three Copies converted::" + threeCopies(str));
    }

    private static List<String> threeCopies(String[] str) {
        List<String> stringList = new ArrayList<>();
        for (String sElement : str) {
            stringList.add(addStringElement(sElement));
        }
        return stringList;
    }

    private static String addStringElement(String sElement) {
        return sElement + sElement + sElement;
    }
}

