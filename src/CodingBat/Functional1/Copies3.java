package CodingBat.Functional1;

import java.util.ArrayList;
import java.util.List;

public class Copies3 {
    public static void main(String[] args) {
        String[] str = {"a", "bb", "ccc"};
        System.out.println("Three Copies converted::" + copies3Logic(str));
    }

    private static List<String> copies3Logic(String[] str) {
        List<String> stringList = new ArrayList<>();
        for (String sElement : str) {
            stringList.add(addStringElement(sElement));
        }
        return stringList;
    }

    private static String addStringElement(String sElement) {
        return sElement.repeat(3);
    }
}

