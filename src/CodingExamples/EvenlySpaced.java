package CodingExamples;

import java.util.ArrayList;
import java.util.List;

public class EvenlySpaced {
    public static void main(String[] args) {
        Integer[] num = {4, 6, 2};
        System.out.println("IsEvenlySpaced::" + "" + evenlySpaced(num));
    }

    private static boolean evenlySpaced(Integer[] num) {
        List<Boolean> booleanList = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if ((num[i] - num[j]) % 2 == 0) {
                    booleanList.add(true);
                } else {
                    booleanList.add(false);
                }
            }
        }
        return !booleanList.contains(false);
    }
}