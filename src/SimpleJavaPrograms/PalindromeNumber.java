package SimpleJavaPrograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 14641;
        if (palindromeNumber(number) == number) {
            System.out.println("The Number is Palindrome" + " " + palindromeNumber(number));
        } else {
            System.out.println("The Number is not Palindrome" + " " + palindromeNumber(number));
        }
    }

    private static int palindromeNumber(int number) {
        StringBuilder reverseString = new StringBuilder();
        String str = String.valueOf(number);
        int size = str.length();
        for (int i = size - 1; i >= 0; i--) {
            reverseString.append(str.charAt(i));
        }
        if (number == Integer.parseInt(reverseString.toString())) {
            return Integer.parseInt(reverseString.toString());
        } else {
            return 0;
        }
    }
}