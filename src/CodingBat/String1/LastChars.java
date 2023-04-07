package CodingBat.String1;

public class LastChars {
    public static void main(String[] args) {
        String str1 = "last";
        String str2 = "chars";
        System.out.println("LastChars Logic result is::" + " " + lastCharsLogic(str1, str2));
    }

    public static String lastCharsLogic(String a, String b) {
        String first = "@";
        String last = "@";
        if (a.length() > 0) {
            first = a.substring(0, 1);
        }
        if (b.length() > 0) {
            last = b.substring(b.length() - 1);
        }
        return first + last;
    }
}
