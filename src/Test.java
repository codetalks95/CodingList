import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"WelcomeJava", "WelcomePython", "WelcomeRuby"};
        int size = arr.length;
        List<String> res = getStringBuilder(arr, size);
        String finalResult = String.join("", res);
        System.out.println("Longest Common Prefix in the Array is: " + finalResult);
    }

    private static List<String> getStringBuilder(String[] arr, int size) {
        List<String> stringList = new ArrayList<>();
        Arrays.sort(arr);
        int length = arr[0].length();
        for (int i = 0; i < length; i++) {
            if (arr[0].charAt(i) == arr[size - 1].charAt(i)) {
                stringList.add(String.valueOf(arr[0].charAt(i)));
            } else {
                break;
            }
        }
        return stringList;
    }
}