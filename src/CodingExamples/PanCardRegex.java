package CodingExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanCardRegex {
    public static void main(String[] args) {
        String PAN_NUMBER = "AAAPL1234C";
        System.out.println("Pan Card Valid Status::" + " " + isPanCardValid(PAN_NUMBER));
    }

    public static boolean isPanCardValid(String pan_number) {
        Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
        Matcher matcher = pattern.matcher(pan_number);
        return matcher.matches();
    }
}
