package CodingBat.String1;

import java.util.ArrayList;
import java.util.List;

public class FirstTwo {
    public static void main(String[] args) {
        String[] strings = {"Hello"};
        System.out.println("MakeOut Word Logic result is::" + " " + firstTwoLogic(strings));
    }

    private static String firstTwoLogic(String[] strings) {
        List<String> stringList = new ArrayList<>();
        for (String string : strings) {
            if (string.length() > 2) {
                String str = string.substring(0, 2);
                stringList.add(str);
            } else {
                stringList.add(string);
            }
        }
        if(stringList.size()>0) {
            return stringList.get(0);
        }
        return null;
    }
}