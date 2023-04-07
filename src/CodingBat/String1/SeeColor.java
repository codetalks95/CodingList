package CodingBat.String1;

import java.util.ArrayList;
import java.util.List;

public class SeeColor {
    public static void main(String[] args) {
        String str = "redxx";
        System.out.println("SeeColorLogic results logic::" + " " + seeColorLogic(str));
    }

    private static String seeColorLogic(String str) {
        String stringValue = "";
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return stringValue;
        }
    }
}
