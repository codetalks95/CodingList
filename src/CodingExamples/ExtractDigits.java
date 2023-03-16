package CodingExamples;

import java.util.ArrayList;
import java.util.List;

public class ExtractDigits {
    public static void main(String[] args) {
        int number = 3678;
        System.out.println(extractDigit(number));
    }

    private static List<Integer> extractDigit(int number) {
        List<Integer> integerList = new ArrayList<>();
        char[] ch = String.valueOf(number).toCharArray();
        for (char c : ch) {
            integerList.add(Integer.valueOf(String.valueOf(c)));
        }
        return integerList;
    }
}
