package CodingBat.Functional1;

import java.util.ArrayList;
import java.util.List;

public class Math1 {
    public static void main(String[] args) {
        Integer[] number = {6, 8, 6, 8, 1};
        System.out.println("Math1 result is::" + " " + math1(number));
    }

    private static List<Integer> math1(Integer[] num) {
        List<Integer> stringList = new ArrayList<>();
        for (Integer s : num) {
            int s1 = 1 + s;
            Integer s2 = s1 * 10;
            stringList.add(s2);
        }
        return stringList;
    }
}