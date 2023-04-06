package CodingBat.String1;

public class DeFront {
    public static void main(String[] args) {
        String words = "away";
        System.out.println("DeFront result logic is::" + " " + deFrontLogic(words));
    }

    private static String deFrontLogic(String str) {
        if (str.length() == 1 && str.charAt(0) != 'a') {
            return "";
        }
        if (str.length() >= 2) {
            if (str.charAt(0) != 'a' && str.charAt(1) != 'b') {
                return str.substring(2);
            } else if (str.charAt(0) != 'a') {
                return str.substring(1);
            } else if (str.charAt(1) != 'b') {
                return "a" + str.substring(2);
            }
        }
        return str;
    }
}