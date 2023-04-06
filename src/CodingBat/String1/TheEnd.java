package CodingBat.String1;

public class TheEnd {
    public static void main(String[] args) {
        String strings = "java";
        boolean front = false;
        System.out.println("The end Logic is::" + " " + theEndLogic(strings, front));
    }

    public static String theEndLogic(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1);
    }
}
