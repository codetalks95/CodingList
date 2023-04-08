package CodingBat.String3;

public class CountTriple {
    public static void main(String[] args) {
        System.out.println("Count Triple Logic is::" + countTriple("abcXXXabc"));
    }

    public static int countTriple(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }
}
