package CodingBat.String1;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class WithoutEnd {
    public static void main(String[] args) {
        String[] strings = {"Hello"};
        System.out.println("Without end Logic is::" + " " + withoutEndLogic(strings));
    }

    private static List<String> withoutEndLogic(String[] strings) {
        List<String> stringList = new ArrayList<>();
        for (String string : strings) {
            stringList.add(string.substring(1, string.length() - 1));
        }
        return stringList;
    }
}