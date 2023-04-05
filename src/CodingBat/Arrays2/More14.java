package CodingBat.Arrays2;

public class More14 {
    public static void main(String[] args) {
        int[] num = {1, 4, 1};
        System.out.println("More14 logic result is::" + " " + more14Logic(num));
    }

    private static boolean more14Logic(int[] num) {
        int count1 = 0;
        int count4 = 0;
        for (int j : num) {
            if (j == 1) {
                count1++;
            }
            if (j == 4) {
                count4++;
            }
            return count1 > count4;
        }
        return false;
    }
}