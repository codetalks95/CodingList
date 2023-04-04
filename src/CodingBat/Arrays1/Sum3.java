package CodingBat.Arrays1;

public class Sum3 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println("Sum3 result Logic is::" + sum3Logic(num));
    }

    private static int sum3Logic(int[] num) {
        int sum = 0;
        if (num.length > 0) {
            for (int j : num) {
                sum += j;
            }
        }
        return sum;
    }
}
