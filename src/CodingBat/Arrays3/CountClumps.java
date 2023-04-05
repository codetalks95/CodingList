package CodingBat.Arrays3;

public class CountClumps {
    public static void main(String[] args) {
        int[] num = {1, 2, 2, 3, 4, 4};
        System.out.println("countClumps result Logic is::" + countClumpsLogic(num));
    }

    private static Integer countClumpsLogic(int[] num) {
        int count = 0;
        int i = 0;
        while (i < num.length) {
            int val = num[i];
            i++;
            int length = 1;
            while (i < num.length && num[i] == val) {
                i++;
                length++;
            }
            if (length > 1) count++;
        }
        return count;
    }
}

