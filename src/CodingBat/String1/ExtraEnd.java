package CodingBat.String1;

public class ExtraEnd {
    public static void main(String[] args) {
        String[] strings = {"Hello"};
        System.out.println("Extra End Logic result is::" + " " + extraEndLogic(strings));
    }

    private static StringBuilder extraEndLogic(String[] strings) {
        String str = null;
        for (String string : strings) {
            char[] ch = string.toCharArray();
            str = String.valueOf(ch[ch.length - 2]) + (ch[ch.length - 1]);
        }
        if (str != null) {
            return new StringBuilder(str.repeat(3));
        }
        return null;
    }
}