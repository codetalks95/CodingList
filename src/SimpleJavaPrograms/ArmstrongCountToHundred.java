package SimpleJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongCountToHundred {
    public static void main(String[] args) {
        int count = 1000;
        System.out.println("Armstrong Number in the following range is:-" + "" + loopArmStrongNumber(count));
    }

    private static int armStrongNumber(int number) {
        int count = 0;
        char[] chars = String.valueOf(number).toCharArray();
        for (char aChar : chars) {
            count += Math.pow(Integer.parseInt(String.valueOf(aChar)), 3);
        }
        return count;
    }

    private static List<Integer> loopArmStrongNumber(int count) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (armStrongNumber(i) == i) {
                integerList.add(i);
            }
        }
        return integerList;
    }
}
