package CodingBat.String1;

public class MiddleThree {
    public static void main(String[] args) {
        System.out.println("MiddleThree result logic is::" + " " + middleThree("Candy"));
    }
    public static String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }
}
