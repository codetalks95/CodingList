package CodingExamples;

import java.util.ArrayList;
import java.util.List;

public class NoYY {
    public static void main(String[] args) {
        String[] str = {"a", "b", "cy"};
        System.out.println("Adding y at the end::" + addYAtEnd(str));
        System.out.println("Result after yy logic::" + noYYLogic(str));
    }

    private static List<String> noYYLogic(String[] str) {
        List<String> stringListData = addYAtEnd(str);
        List<String> stringList = new ArrayList<>();
        for (String sElement : stringListData) {
            if (!sElement.contains("yy")) {
                stringList.add(sElement);
            }
        }
        return stringList;
    }

    private static List<String> addYAtEnd(String[] str) {
        List<String> stringList = new ArrayList<>();
        for (String sElement : str) {
            stringList.add(sElement + "y");
        }
        return stringList;
    }
}

