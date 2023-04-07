package CodingBat.String1;

public class MiddleTwo {
    public static void main(String[] args) {
        System.out.println("MiddleTwo result Logic is::" + " " + middleTwo("string"));
    }
    public static String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}