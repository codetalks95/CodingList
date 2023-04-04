package CodingBat.Arrays2;

public class TwoTwo {
    public static void main(String[] args) {
        int[] num = {2, 2, 4, 2};
        System.out.println("TwoTwo logic result is::" + " " + twoTwoLogic(num));
    }

    public static boolean twoTwoLogic(int[] num) {
        if (num.length == 1 && num[0] == 2) {
            return false;
        }
        if (num.length >= 2 && ((num[0] == 2 && num[1] != 2) || (num[num.length - 1] == 2 && num[num.length - 2] != 2))) {
            return false;
        }
        for (int i = 1; i <= num.length - 2; i++) {
            if (num[i] == 2 && num[i - 1] != 2 && num[i + 1] != 2) {
                return false;
            }
        }
        return true;
    }
}