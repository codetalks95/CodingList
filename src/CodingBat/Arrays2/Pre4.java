package CodingBat.Arrays2;

import java.util.Arrays;

public class Pre4 {
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 1};
        System.out.println("Pre4 result Logic is::" + Arrays.toString(pre4Logic(num)));
    }

    private static int[] pre4Logic(int[] num) {
        int i = 0;
        while (num[i] != 4) {
            i++;
        }
        return Arrays.stream(num, 0, i).toArray();
    }
}