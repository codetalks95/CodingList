package CodingBat.Arrays2;

import java.util.ArrayList;
import java.util.List;

public class No14 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println("No14 logic result is::" + " " + no14Logic(num));
    }

    private static boolean no14Logic(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (int j : num) {
            integerList.add(j);
        }
        return integerList.contains(1) || integerList.contains(4);
    }
}
