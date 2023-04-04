package CodingBat.Arrays1;

public class Unlucky1 {
    public static void main(String[] args) {
        int[] num = {1, 3, 4, 5};
        System.out.println("UnLucky1 result Logic is::" + unlucky1Logic(num));
    }

    public static boolean unlucky1Logic(int[] num) {
        if (num.length < 2) {
            return false;
        } else if ((num[0] == 1 && num[1] == 3) || (num[num.length - 2] == 1 && num[num.length - 1] == 3)) {
            return true;
        } else if (num.length > 2 && num[1] == 1 && num[2] == 3) {
            return true;
        } else {
            return false;
        }
    }
}
