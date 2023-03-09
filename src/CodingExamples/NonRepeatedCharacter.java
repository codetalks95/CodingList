package CodingExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        String str = generateRandomString();
        System.out.println("Random String is:-" + " " + str);
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            Map<Character, Integer> maps = nonRepeatedCharacter(str, aChar);
            System.out.println(maps);
        }
    }

    private static Map<Character, Integer> nonRepeatedCharacter(String str, char chars) {
        int count = 0;
        char[] characters = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char character : characters) {
            if (character == chars) {
                count++;
            }
        }
        map.put(chars, count);
        return map;
    }

    public static String generateRandomString() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
}
