package CodingBat.Arrays2;


import java.util.Arrays;

public class FizzArray {
    public static void main(String[] args) {
        int[] num = {1, 6};
        System.out.println("FizzArray logic result is::" + " " + Arrays.toString(fizzBuzzLogic(num)));
    }

    public static int[] fizzBuzzLogic(int[] n) {
        int[] arr = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}