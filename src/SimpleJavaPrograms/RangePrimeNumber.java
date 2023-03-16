package SimpleJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class RangePrimeNumber {
    public static void main(String[] args) {
        int count = 100;
        System.out.println("Prime Numbers in the range of" + " " + count + " " + "is" + primeNumbers(count));
    }

    private static List<Integer> primeNumbers(int count) {
        int flag = 0;
        List<Integer> integerList = new ArrayList<>();
        for (int j = 1; j < 100; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                integerList.add(j);
            }
        }
        return integerList;
    }
}
