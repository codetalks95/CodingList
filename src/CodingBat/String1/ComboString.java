package CodingBat.String1;

import java.util.ArrayList;
import java.util.List;

public class ComboString {
    public static void main(String[] args) {
        String[] strings = {"Hello", "hi"};
        System.out.println("Combo String Logic is::" + " " + comboStringLogic(strings));
    }

    private static List<String> comboStringLogic(String[] strings) {
        String[] str = new String[strings.length];
        List<String> stringList = new ArrayList<>();
        if(strings.length>=2) {
            for (int i = 0; i < strings.length; i++) {
                str[i] = strings[strings.length - i - 1];
            }
            for (int i = 0; i < 1; i++) {
                String s = str[0] + str[1] + str[0];
                stringList.add(s);
            }
            return stringList;
        }
        return null;
    }
}