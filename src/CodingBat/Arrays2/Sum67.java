package CodingBat.Arrays2;

import java.util.ArrayList;
import java.util.List;

public class Sum67 {
    public static void main(String[] args) {
        int[] num = {1, 1, 6, 7, 2};
        System.out.println("Sum2 result Logic is::" + sum67Logic(num));
    }

    private static int sum67Logic(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (int j : num) {
            integerList.add(j);
        }
        if (integerList.contains(6) || integerList.contains(7)) {
            int index1 = integerList.indexOf(6);
            int index2 = integerList.indexOf(7);
            for (int i : new int[]{index1, index2 - 1}) {
                integerList.remove(i);
            }
            return addList(integerList);
        }
        return 0;
    }

    private static int addList(List<Integer> integerList) {
        int sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        return sum;
    }

    public static boolean hasDigit6Or7(int number, int number1) {
        while (number > 0) {
            if (number % 10 == 6 && number1 % 10 == 6 || number1 % 10 == 7 && number % 10 == 7) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}