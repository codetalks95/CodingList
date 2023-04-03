package CodingBat.Functional1;

import java.util.ArrayList;
import java.util.List;

public class RightDigit {
    public static void main(String[] args) {
        Integer[] number = {16, 8, 886, 8, 1};
        System.out.println("More Y result is::" + " " + rightDigit(number));
    }

    private static List<Integer> rightDigit(Integer[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (Integer s : num) {
            Integer s1 = s % 10;
            integerList.add(s1);
        }
        return integerList;
    }
}