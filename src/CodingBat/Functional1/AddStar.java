package CodingBat.Functional1;

import java.util.ArrayList;
import java.util.List;

public class AddStar {
    public static void main(String[] args) {
        String[] str = {"a", "bb", "ccc"};
        System.out.println("Adding Star Result is::" + " " + addStar(str));
    }

    private static List<String> addStar(String[] str) {
        List<String> stringList = new ArrayList<>();
        for (String s : str) {
            s+="*";
            stringList.add(s);
        }
        return stringList;
    }
}