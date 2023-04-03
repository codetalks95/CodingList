package CodingBat.Functional1;

import java.util.ArrayList;
import java.util.List;

public class Square {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 3};
        System.out.println("More Y result is::" + " " + squareLogic(num));
    }

    private static List<Double> squareLogic(Integer[] num) {
        List<Double> stringList = new ArrayList<>();
        for (Integer s : num) {
            double number = Math.pow(s, 2);
            stringList.add(number);
        }
        return stringList;
    }
}