package CodingBat.Arrays1;

import java.util.Arrays;

public class FrontPiece {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println("FrontPieceLogic result is::" + Arrays.toString(frontPieceLogic(num)));
    }

    public static int[] frontPieceLogic(int[] nums) {
        int[] arr;
        if (nums.length < 2) {
            arr = new int[nums.length];
        } else {
            arr = new int[2];
        }
        if (nums.length > 0) {
            arr[0] = nums[0];
        }
        if (nums.length > 1) {
            arr[1] = nums[1];
        }
        return arr;
    }
}
