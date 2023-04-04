package CodingBat.Arrays2;

public class ZeroFront {
    public static void main(String[] args) {
        Integer[] num = {1, 0, 0, 1};
        System.out.println("ZeroFront result Logic is::" + zeroFrontLogic(num));
    }

    public static Integer[] zeroFrontLogic(Integer[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int i = 0;
        while (nums[i] == 0) {
            i++;
        }
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return nums;
    }
}