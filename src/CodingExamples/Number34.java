package CodingExamples;

import java.util.ArrayList;
import java.util.List;

public class Number34 {
    public static void main(String[] args) {
        String[] str = {"ccc", "dddd", "apple"};
        System.out.println("Number34 Logic result is::" + number34Logic(str));
    }

    private static List<String> number34Logic(String[] str) {
        List<String> stringList = new ArrayList<>();
        List<String> unWantedList = new ArrayList<>();
        for (String s : str) {
            if (s.length() == 3 || s.length() == 4) {
                unWantedList.add(s);
            } else {
                stringList.add(s);
            }
        }
        return stringList;
    }
}

