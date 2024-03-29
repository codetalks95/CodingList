package CodingBat.String3;

public class NotReplace {
    public static void main(String[] args) {
        System.out.println("Not Replace Logic is::" + notReplaceLogic("is test"));
    }

    public static String notReplaceLogic(String str) {
        if (str.equals("is")) return "is not";

        StringBuilder result = new StringBuilder();
        int i = 0;

        if (str.length() >= 3 && str.startsWith("is") && !Character.isLetter(str.charAt(2))) {
            result.append("is not");
            i = 2;
        }

        while (i < str.length()) {
            if (!Character.isLetter(str.charAt(i))) {
                result.append(str.charAt(i));
                i++;
            } else if (i >= 1 && i <= str.length() - 3 && !Character.isLetter(str.charAt(i - 1)) && str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i + 2))) {
                result.append("is not");
                i += 2;
            } else if (i >= 1 && !Character.isLetter(str.charAt(i - 1)) && str.substring(i).equals("is")) {
                result.append("is not");
                i += 2;
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}