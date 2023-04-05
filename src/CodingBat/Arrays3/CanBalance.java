package CodingBat.Arrays3;

import java.util.ArrayList;
import java.util.List;

public class CanBalance {
    public static void main(String[] args) {
        int[] num = {10, 10};
        System.out.println("Can Balance Logic result is::" + canBalanceLogic(num));
    }

    private static Boolean canBalanceLogic(int[] num) {
        int length = num.length;
        if (num.length % 2 == 0) {
            length = length / 2;
        } else {
            length = length / 2 + 1;
        }
        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerDataList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            integerList.add(num[i]);
        }
        for (int i = length; i < num.length; i++) {
            integerDataList.add(num[i]);
        }
        return checkBalance(integerList, integerDataList);
    }

    private static boolean checkBalance(List<Integer> integerList, List<Integer> integerDataList) {
        int sum = 0, val = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        System.out.println("sum" + " " + sum + "integerList" + " " + integerList);
        for (Integer integer : integerDataList) {
            val += integer;
        }
        System.out.println("val" + " " + val + "integerDataList" + " " + integerDataList);
        return sum == val;
    }
}
