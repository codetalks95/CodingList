package CodingBat.Arrays3;

import java.util.Arrays;

public class SeriesUp {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("seriesUp Logic result is::" + Arrays.toString(seriesUpLogic(n)));
    }

    private static int[] seriesUpLogic(int n) {
        int[] arr = new int[n*(n+1)/2];
        int index = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                arr[index + j] = j + 1;
            }
            index += i;
        }
        return arr;
    }
}

