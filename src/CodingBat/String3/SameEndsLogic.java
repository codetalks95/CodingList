package CodingBat.String3;

public class SameEndsLogic {
    public static void main(String[] args) {
        System.out.println("SameEnds Logic result is::" + sameEndsLogic("abXYab"));
    }

    public static String sameEndsLogic(String string) {
        int start = (int) Math.ceil((double) string.length() / 2);
        int end = string.length() / 2;

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.substring(0, end).equals(string.substring(start))) {
                return string.substring(0, end);
            } else {
                start++;
                end--;
            }
        }
        return "";
    }
}