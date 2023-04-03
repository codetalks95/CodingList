package CodingBat.Functional2;

import java.util.ArrayList;
import java.util.List;

public class Square56 {
    private static final Integer NUMBER = 10;

    public static void main(String[] args) {
        double[] num = {3, 1, 4};
        System.out.println("Square56 Logic result is::" + square56LogicIs(num));
    }

    private static List<Double> square56LogicIs(double[] num) {
        List<Double> integerList = new ArrayList<>();
        for (double number : num) {
            double intNum = Math.pow(number, 2) + NUMBER;
            if (intNum % 10 != 6.0) {
                if (intNum % 10 != 5.0) {
                    integerList.add(intNum);
                }
            }
        }
        return integerList;
    }
}

