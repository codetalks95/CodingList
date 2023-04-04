package CodingBat.Arrays2;

import java.util.ArrayList;
import java.util.List;

public class Has22 {
    public static void main(String[] args) {
        int[] num = {1, 2, 1, 2};
        System.out.println("Has22 result Logic is::" + has22Logic(num));
    }

    private static boolean has22Logic(int[] num) {
        List<Boolean> booleanList = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (i != num.length - 1) {
                if (num[i] == 2 && num[i + 1] == 2) {
                    booleanList.add(true);
                } else {
                    booleanList.add(false);
                }
            }
        }
        return booleanList.stream().allMatch(b -> b);
    }
}