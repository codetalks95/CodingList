package CodingBat.Arrays2;

public class CountEvens {
    public static void main(String[] args) {
        int[] num = {2, 1, 2, 3, 4};
        System.out.println("CountEven logic result is::" + " " + countEvensLogic(num));
    }

    public static int countEvensLogic(int[] num) {
        int count = 0;
        for (int j : num) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}