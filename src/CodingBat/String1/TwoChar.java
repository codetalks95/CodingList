package CodingBat.String1;

public class TwoChar {
    public static void main(String[] args) {
        String strings = "java";
        int index = 0;
        System.out.println("Without end Logic is::" + " " + twoCharLogic(strings, index));
    }

    public static String twoCharLogic(String str, int index) {
        if (index + 2 > str.length() || index < 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
}