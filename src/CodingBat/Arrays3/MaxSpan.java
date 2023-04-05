package CodingBat.Arrays3;

public class MaxSpan {
    public static void main(String[] args) {
        int[] num = {1, 2, 1, 1, 3};
        System.out.println("MaxSpan Logic Logic is::" + maxSpanLogic(num));
    }

    private static Integer maxSpanLogic(int[] num) {
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            int j = num.length - 1;
            while (num[i] != num[j]) {
                j--;
            }
            int span = j - i + 1;
            if (span > max) max = span;
        }
        return max;
    }
}

