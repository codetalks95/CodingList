package CodingExamples;

import java.util.ArrayList;
import java.util.List;

public class MoreY {
    public static void main(String[] args) {
        String[] str = {"a", "bb", "ccc"};
        System.out.println("More Y result is::" + " " + moreY(str));
    }

    private static List<String> moreY(String[] str) {
        List<String> stringList = new ArrayList<>();
        for (String s : str) {
            String s1 = "Y" + s;
            s1 += "Y";
            stringList.add(s1);
        }
        return stringList;
    }
}