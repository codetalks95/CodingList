package CodingBat.Arrays1;

import java.util.ArrayList;
import java.util.List;

public class No23 {
    public static void main(String[] args) {
        int[] num = {4, 5};
        System.out.println("No23 Logic result Logic is::" + no23Logic(num));

    }

    private static boolean no23Logic(int[] num) {
        List<Boolean> booleanList = new ArrayList<>();
        for (int j : num) {
            if (j == 2 || j == 3) {
                booleanList.add(false);
            } else {
                booleanList.add(true);
            }
        }
        return !booleanList.contains(false);
    }
}
