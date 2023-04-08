package CodingBat.String3;

public class MirrorEnds {
    public static void main(String[] args) {
        System.out.println("Mirror Ends Logic  is::" + mirrorEndsLogic("abXYZba"));
    }

    public static String mirrorEndsLogic(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                result.append(string.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}