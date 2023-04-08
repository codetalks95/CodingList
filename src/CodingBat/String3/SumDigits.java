package CodingBat.String3;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println("Sum Digit Logic result is::" + sumDigitsLogic("aa1bc2d3"));
    }

    public static int sumDigitsLogic(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum+=str.charAt(i) - '0';
            }
        }
        return sum;
    }
}
