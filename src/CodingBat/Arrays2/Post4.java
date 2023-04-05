package CodingBat.Arrays2;

import java.util.Arrays;

public class Post4 {
    public static void main(String[] args) {
        int[] num = {2, 4, 1, 2};
        System.out.println("Pre4 result Logic is::" + Arrays.toString(post4Logic(num)));
    }

    public static int[] post4Logic(int[] num) {
        int i = num.length - 1;
        while (num[i] != 4) {
            i--;
        }
        int[] arr = new int[num.length - i - 1];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = num[i + j + 1];
        }
        return arr;
    }
}
