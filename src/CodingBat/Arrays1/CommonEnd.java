package CodingBat.Arrays1;

public class CommonEnd {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1};
        System.out.println("CommonEnd Logic result is::" + commonEnd(num));

    }

    private static boolean commonEnd(int[] num) {
        if (num.length > 0) {
            return num[0] == num[num.length - 1];
        }
        return false;
    }
}
