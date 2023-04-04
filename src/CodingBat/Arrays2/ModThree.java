package CodingBat.Arrays2;

public class ModThree {
    public static void main(String[] args) {
        int[] num = {2, 1, 3, 5};
        System.out.println("ModThree result Logic is::" + modThreeLogic(num));
    }

    private static boolean modThreeLogic(int[] num) {
        if (num.length < 3) {
            return false;
        }
        for (int i = 0; i <= num.length - 3; i++) {
            if (num[i] % 2 == num[i + 1] % 2 && num[i] % 2 == num[i + 2] % 2)
                return true;
        }
        return false;
    }
}
