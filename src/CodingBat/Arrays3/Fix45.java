package CodingBat.Arrays3;

import java.util.Arrays;

public class Fix45 {
    public static void main(String[] args) {
        int[] num = {5, 4, 9, 4, 9, 5};
        System.out.println("fix45Logic Logic result::" + Arrays.toString(fix45Logic(num)));
    }

    private static int[] fix45Logic(int[] num) {
        int i = 0;
        int j = 0;
        while (j < num.length && num[j] != 5) {
            j++;
        }
        while (i < num.length) {
            if (num[i] == 4) {
                int temp = num[i + 1];
                num[i + 1] = num[j];
                num[j] = temp;
                while ((j < num.length && num[j] != 5) || j == i + 1) {
                    j++;
                }
            }
            i++;
        }
        return num;
    }
}
