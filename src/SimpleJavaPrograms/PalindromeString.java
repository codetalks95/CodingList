package SimpleJavaPrograms;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "Radar";
        if (palindromeString(str.toLowerCase()).equals(str.toLowerCase())) {
            System.out.println("The String is Palindrome" + " " + palindromeString(str));
        } else {
            System.out.println("The String is not Palindrome" + " " + palindromeString(str));
        }
    }

    private static String palindromeString(String str) {
        StringBuilder reversedString = new StringBuilder();
        int size = str.length();
        for (int i = size - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        if (reversedString.toString().equalsIgnoreCase(str)) {
            return reversedString.toString();
        }
        return "Empty";
    }
}
