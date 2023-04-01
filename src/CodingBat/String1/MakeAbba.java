package CodingBat.String1;

import java.util.Arrays;

public class MakeAbba {
    public static void main(String[] args) {
        String[] strings = {"Hi", "Bye"};
        System.out.println("Make Abba Logic Result is::"+" "+makeAbbaLogic(strings));
    }

    private static StringBuilder makeAbbaLogic(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(strings).forEach(stringBuilder::append);
        for (int i = strings.length-1; i >=0 ; i--) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder;
    }
}