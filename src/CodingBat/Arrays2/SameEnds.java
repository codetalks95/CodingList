package CodingBat.Arrays2;

public class SameEnds {
    public static void main(String[] args) {
        int[] num = {5, 6, 45, 99, 13, 5, 6};
        System.out.println("SameEnds result Logic is::" + sameEndsLogic(num, num.length));
    }

    private static boolean sameEndsLogic(int[] num, int len) {
        for (int i = 0; i < len; i++) {
            if (num[i] != num[num.length - len + i]) return false;
        }
        return true;
    }
}