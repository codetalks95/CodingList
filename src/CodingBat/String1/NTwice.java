package CodingBat.String1;

public class NTwice {
    public static void main(String[] args) {
        String strings = "Hello";
        int n = 2;
        System.out.println("Result for nTwice Logic::" + " " + nTwice(strings, n));
    }

    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
