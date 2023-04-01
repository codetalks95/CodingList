package CodingBat.String1;

public class WithoutString {
    public static void main(String[] args) {
        String[] base = {"Hello there"};
        String remove = "x";
        System.out.println(withoutString(base, remove));
    }

    private static String withoutString(String[] base, String remove) {
        String str = null;
        for (String s : base) {
            str = s.replaceAll(remove, "");
        }
        return str;
    }
}
