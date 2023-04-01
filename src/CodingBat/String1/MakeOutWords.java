package CodingBat.String1;

public class MakeOutWords {
    public static void main(String[] args) {
        String[] strings = {"<<>>", "Yay"};
        System.out.println("MakeOut Word Logic result is::" + " " + makeOutWords(strings));
    }

    private static String makeOutWords(String[] strings) {
        char[] ch = strings[0].toCharArray();
        if (ch.length>= 4 && strings.length >= 2) {
            return String.valueOf(ch[0]) + ch[1] + strings[1] + ch[2] + ch[3];
        }
        return null;
    }
}