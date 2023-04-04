package CodingBat.Arrays1;

public class MakeLast {
    public static void main(String[] args) {
        int[] num = {4, 5, 6};
        System.out.println("FrontPieceLogic result is::" + makeLastLogic(num));
    }
    public static int[] makeLastLogic(int[] num) {
        int[] arr = new int[2 * num.length];
        arr[arr.length - 1] = num[num.length - 1];
        return arr;
    }
}
