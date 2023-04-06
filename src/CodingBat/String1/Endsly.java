package CodingBat.String1;

public class Endsly {
    public static void main(String[] args) {
        String words = "away";
        System.out.println("DeFront result logic is::" + " " + endsLyLogic(words));
    }

    public static boolean endsLyLogic(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.endsWith("ly");
    }
}
