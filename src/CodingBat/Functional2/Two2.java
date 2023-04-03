package CodingBat.Functional2;

import java.util.ArrayList;
import java.util.List;

public class Two2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println("Result of Two2 Logic is::" + " " + two2Logic(num));
    }

    private static List<String> two2Logic(int[] num) {
        List<String> integerList = new ArrayList<>();
        for (int j : num) {
            integerList.add(String.valueOf(j * 2));
        }
        System.out.println("IntegerList is::" + integerList);
        return checkIfLastDigitIs2(integerList);
    }

    private static List<String> checkIfLastDigitIs2(List<String> integerList) {
        List<String> lists = new ArrayList<>();
        for (String s : integerList) {
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[chars.length - 1] != '2') {
                    lists.add(s);
                }
            }
        }
        return lists;
    }
}
