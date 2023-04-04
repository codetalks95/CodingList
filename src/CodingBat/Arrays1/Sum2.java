package CodingBat.Arrays1;

public class Sum2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println("Sum2 result Logic is::" + sum2Logic(num));
    }

    private static int sum2Logic(int[] num) {
        int sum = 0;
        if (num.length >= 2) {
            for (int i = 0; i < 2; i++) {
                sum += num[i];
            }
        }
        return sum;
    }
}
