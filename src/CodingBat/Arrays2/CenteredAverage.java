package CodingBat.Arrays2;

public class CenteredAverage {
    public static void main(String[] args) {
        int[] num = {1, 2, 2, 6, 99, 99, 7};
        System.out.println("CenteredAverage logic result is::" + " " + centeredAverageLogic(num));
    }

    public static int centeredAverageLogic(int[] num) {
        int sum = 0;
        int min = num[0];
        int max = num[0];
        for (int j : num) {
            sum += j;
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        return (sum - min - max) / (num.length - 2);
    }
}