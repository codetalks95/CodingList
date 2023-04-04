package CodingBat.Arrays2;

public class Has77 {
    public static void main(String[] args) {
        int[] num = {1, 7, 1, 1, 7};
        System.out.println("Sum2 result Logic is::" + has77Logic(num));
    }

    private static boolean has77Logic(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (i != num.length - 1) {
                if (num[i] == 7 && num[i + 1] == 7 || num[i] == 7 && num[i + 2] == 7) {
                    return true;
                }
            }
        }
        return false;
    }
}
