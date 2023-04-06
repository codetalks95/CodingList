package CodingBat.String1;

public class WithoutX {
    public static void main(String[] args) {
        String str = "xHi";
        System.out.println("Result of WithoutX logic is" + " " + withoutXLogic(str));
    }

    private static String withoutXLogic(String str) {
        char[] ch = str.toCharArray();
        int length = ch.length;
        int index = str.indexOf("x");
        if (index == 0 || index == length - 1) {
            str = str.replace("x", "");
            return str;
        }
        return str;
    }
}