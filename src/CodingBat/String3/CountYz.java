package CodingBat.String3;

public class CountYz {
    public static void main(String[] args) {
        System.out.println("CountYZ  Logic result is::" + countYZLogic("fez dey"));
    }

    public static int countYZLogic(String str) {
        int count = 0;
        if (str.length() == 0) {
            return 0;
        }
        for (int i = 0; i <= str.length() - 2; i++) {
            if ((Character.toLowerCase(str.charAt(i)) == 'y' || Character.toLowerCase(str.charAt(i)) == 'z') && !Character.isLetter(str.charAt(i + 1)))
                count++;
        }
        char c = Character.toLowerCase(str.charAt(str.length() - 1));
        if (c == 'y' || c == 'z') {
            count++;
        }
        return count;
    }
}