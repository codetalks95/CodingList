package CodingBat.Arrays1;

import java.util.Arrays;

public class Make2 {
    public static void main(String[] args) {
        int[] a = {4, 5};
        int[] b = {1, 2, 3};
        System.out.println("Make2Logic result is::" + Arrays.toString(make2Logic(a, b)));
    }

    public static int[] make2Logic(int[] a, int[] b) {
        int[] myArray = new int[2];
        int aLen = a.length;
        int bLen = b.length;
        if (aLen == 0) {
            myArray[0] = b[0];
            myArray[1] = b[1];
            return myArray;
        } else if (aLen == 1 && bLen == 1) {
            myArray[0] = a[0];
            myArray[1] = b[0];
            return myArray;
        } else if (aLen == 1) {
            myArray[0] = a[0];
            myArray[1] = b[0];
            return myArray;
        } else {
            myArray[0] = a[0];
            myArray[1] = a[1];
            return myArray;
        }
    }
}
