package CodingBat.Arrays2;

public class MatchUp {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {2, 3, 0}};
        System.out.println("MatchUp result Logic is::" + " " + matchUpLogic(num[0], num[1]));
    }

    public static int matchUpLogic(int[] num1, int[] num2) {
        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            if (Math.abs(num1[i] - num2[i]) <= 2 && num1[i] != num2[i]) {
                count++;
            }
        }
        return count;
    }
}
