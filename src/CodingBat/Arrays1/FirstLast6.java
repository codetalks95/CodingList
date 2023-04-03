package CodingBat.Arrays1;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] num = { 6, 1, 2, 3};
        System.out.println("FirstLast6 result Logic is::" + firstLast6LogicIs(num));

    }

    private static boolean firstLast6LogicIs(int[] num) {
        if (num.length > 0) {
            return num[0] == 6 || num[num.length - 1] == 6;
        }
        return false;
    }
}
