package FibonnaciSeries;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IsFibonnaciNumber {
    public static void main(String[] args) {
        int range = 100;
        Random random = new Random();
        int number = random.nextInt(100);
        if(!fibonnaciSeries(number, range).equals(-1)){
            System.out.println("Number" + " " + fibonnaciSeries(number, range) + " " + "fibonnaci Number");
        }else{
            System.out.println("Number" + " " +number + " " + "is not fibonnaci Number");
        }
    }

    private static Integer fibonnaciSeries(int number, int range) {
        List<Integer> integerList = new ArrayList<>();
        int a, b = 0, c = 1;
        for (int i = 1; i <= range; i++) {
            a = b;
            b = c;
            c = a + b;
            integerList.add(a);
        }
        if (integerList.contains(number)) {
            return number;
        }
        return -1;
    }
}
