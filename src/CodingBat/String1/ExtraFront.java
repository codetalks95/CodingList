package CodingBat.String1;

public class ExtraFront {
    public static void main(String[] args) {
        String strings = "Hello";
        System.out.println("Extra Front Logic result is::" + " " + extraFrontLogic(strings));
    }

    public static String extraFrontLogic(String str) {
        if (str.length() >= 2) {
            str = str.substring(0, 2);
        }
        return str + str + str;
    }
}
