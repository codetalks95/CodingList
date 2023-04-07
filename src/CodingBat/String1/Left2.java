package CodingBat.String1;

public class Left2 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Left2Logic Logic result is::" + " " + left2Logic(str));
    }

    public static String left2Logic(String str) {
        return str.substring(2) + str.substring(0, 2);
    }
}
