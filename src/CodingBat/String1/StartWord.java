package CodingBat.String1;

public class StartWord {
    public static void main(String[] args) {
        String str1 = "hippo";
        String str2 = "hi";
        System.out.println("Start Word Logic results::" + " " + startWordLogic(str1, str2));
    }

    public static String startWordLogic(String str, String word) {
        if (str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }
}
