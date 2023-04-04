package CodingBat.Arrays2;

import java.util.ArrayList;
import java.util.List;

public class Has12 {
    public static void main(String[] args) {
        int[] num = {1, 3, 1};
        System.out.println("Has22 result Logic is::" + has22Logic(num));
    }

    private static boolean has22Logic(int[] num) {
        List<Integer> booleanList = new ArrayList<>();
        for (int j : num) {
            booleanList.add(j);
        }
        if (booleanList.contains(1) && booleanList.contains(2)) {
            int index1 = booleanList.indexOf(1);
            for (int i = index1; i < booleanList.size(); i++) {
                if (booleanList.get(i) == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}