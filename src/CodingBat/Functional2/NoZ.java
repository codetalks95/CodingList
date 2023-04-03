package CodingBat.Functional2;

import java.util.ArrayList;
import java.util.List;

public class NoZ {
    public static void main(String[] args) {
        String[] str = {"aaa", "bbb", "aza"};
        System.out.println("NoZ Logic result is::" + noZLogic(str));
    }

    private static List<String> noZLogic(String[] str) {
        List<String> stringList = new ArrayList<>();
        for (String s : str) {
            if (!s.contains("z")) {
                stringList.add(s);
            }
        }
        return stringList;
    }
}

