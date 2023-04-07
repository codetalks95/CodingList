package CodingBat.String1;

public class MinCat {
    public static void main(String[] args) {
        System.out.println("MinCat result Logic is::" + " " + minCat("Hello", "Hi"));
    }

    public static String minCat(String a, String b) {
        int min = Math.min(a.length(), b.length());

        return a.substring(a.length() - min) + b.substring(b.length() - min);
    }
}
