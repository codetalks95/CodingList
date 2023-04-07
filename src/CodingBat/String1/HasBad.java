package CodingBat.String1;

public class HasBad {
    public static void main(String[] args) {
        String str = "xxbadxx";
        System.out.println("HasBad Logic result is::" + " " + hasBadLogic(str));
    }

    private static boolean hasBadLogic(String str) {
        char[] ch = str.toCharArray();
        if (ch.length >= 3) {
            return str.indexOf("b") == 1 || str.indexOf("b") == 0;
        }
        return false;
    }
}