package CodingBat.Arrays2;

import java.util.ArrayList;
import java.util.List;

public class Only14 {
    public static void main(String[] args) {
        int[] num = {1, 1};
        System.out.println("Either24 result Logic is::" + either24Logic(num));
    }

    private static boolean either24Logic(int[] num) {
        List<Boolean> booleanList = new ArrayList<>();
        for (int j : num) {
            if (j == 1 || j == 4) {
                booleanList.add(true);
            } else {
                booleanList.add(false);
            }
        }
        return !booleanList.contains(false);
    }
}