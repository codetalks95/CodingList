package CodingBat.Arrays1;

public class Has23 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        System.out.println("FrontPieceLogic result is::" + has23Logic(number));
    }
    public static boolean has23Logic(int[] num) {
        for (int number : num) {
            if (number == 2 || number == 3)
                return true;
        }
        return false;
    }
}
