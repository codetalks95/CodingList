package CodingBat.Arrays1;

public class SameFirstLast {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1};
        System.out.println("FirstLast6 result Logic is::" + sameFirstLogic(num));

    }

    private static boolean sameFirstLogic(int[] num) {
        if (num.length > 0) {
            return num[0] ==num[num.length - 1];
        }
        return false;
    }
}
