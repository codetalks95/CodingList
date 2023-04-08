package CodingBat.String3;

public class SumNumber {
    public static void main(String[] args) {
        System.out.println("Sum Number Logic result is is::" + sumNumberLogic("abc123xyz"));
    }

    public static int sumNumberLogic(String str) {
        int sum = 0;
        int i = 0;
        int begin;
        int end;

        while (i < str.length() && !Character.isDigit(str.charAt(i))) {
            i++;
        }

        begin = i;
        end = i;

        while (i < str.length()) {
            if (!Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.substring(begin, end));
                while (i < str.length() && !Character.isDigit(str.charAt(i))) {
                    i++;
                }
                begin = i;
                end = i;
            } else {
                end++;
                i++;
            }
        }
        if (end > begin) {
            sum += Integer.parseInt(str.substring(begin, end));
        }
        return sum;
    }
}
