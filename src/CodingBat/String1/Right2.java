package CodingBat.String1;

public class Right2 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Right2Logic result Logic::" + " " + right2Logic(str));
    }

    public static String right2Logic(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
}