package CodingBat.Strings;

import java.util.ArrayList;
import java.util.List;

public class SumDigits {
    public static void main(String[] args) {
        String str = "aa11b33";
        System.out.println("Sum of Digits" + " " + sumDigits(str));
    }

    private static Integer sumDigits(String str) {
        int count = 0;
        List<Integer> integerList = new ArrayList<>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (Character.isDigit(c))
                integerList.add(Integer.parseInt(String.valueOf(c)));
        }
        for (Integer integer : integerList) {
            count += integer;
        }
        return count;
    }
}
