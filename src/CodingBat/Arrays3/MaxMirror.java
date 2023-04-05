package CodingBat.Arrays3;

public class MaxMirror {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 8, 9, 3, 2, 1};
        System.out.println("maxMirrorLogic result Logic is::" + maxMirrorLogic(num));
    }

    private static int maxMirrorLogic(int[] num) {
        int max = 0;

        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = num.length - 1; j >= 0 && i + count < num.length; j--) {
                if (num[i + count] == num[j]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}

