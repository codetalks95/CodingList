package CodingBat.Arrays2;

public class Lucky13 {
    public static void main(String[] args) {
        int[] num = {0, 2, 4};
        System.out.println("Lucky13 result Logic is::" + lucky13Logic(num));
    }

    public static boolean lucky13Logic(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3)
                return false;
        }
        return true;
    }
}