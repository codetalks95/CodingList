package CodingBat.Arrays2;

public class Either24 {
    public static void main(String[] args) {
        int[] num = {4, 4, 1, 2, 2};
        System.out.println("Either24 result Logic is::" + either24Logic(num));
    }

    private static boolean either24Logic(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (i != num.length - 1) {
                if (num[i] == 4 && num[i + 1] == 4 || num[i] == 2 && num[i + 1] == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}