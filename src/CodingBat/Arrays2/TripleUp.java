package CodingBat.Arrays2;

import java.util.ArrayList;
import java.util.List;

public class TripleUp {
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 5, 6, 2};
        System.out.println("Sum2 result Logic is::" + tripleUpLogic(num));
    }

    private static boolean tripleUpLogic(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (int j : num) {
            integerList.add(j);
        }
        return checkListContains(integerList);
    }

    private static boolean checkListContains(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.contains(integerList.get(i) + 1) && integerList.contains(integerList.get(i) + 1)) {
                return true;
            }
        }
        return false;
    }
}