package CodingBat.String1;

public class LastTwo {
    public static void main(String[] args) {
        String str = "coding";
        System.out.println("LastTwo Logic result is::" + " " + lastTwoLogic(str));
    }

    private static String lastTwoLogic(String str) {
        char[] c = str.toCharArray();
        char temp = c[c.length - 1];
        c[c.length - 1] = c[c.length - 2];
        c[c.length - 2] = temp;
        return new String(c);
    }
}