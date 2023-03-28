package CodingExamples;

import java.util.ArrayList;
import java.util.List;

public class RemoveX {
    public static void main(String[] args) {
        String[] str = {"xxax", "xbxbx", "xxcx"};
        System.out.println("Removed X::" + " " + removeX(str));
    }

    private static List<String> removeX(String[] str) {
        List<String> stringList = new ArrayList<>();
        for (String s : str) {
            String string = s.replace("x", "");
            stringList.add(string);
        }
        return stringList;
    }
}
