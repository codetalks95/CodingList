package CodingBat.String1;

public class NonStart {
    public static void main(String[] args) {
        System.out.println("NonStart result Logic is::" + " " + nonStart("Hello", "There"));
    }

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
}
