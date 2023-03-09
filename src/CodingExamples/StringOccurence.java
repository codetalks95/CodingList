package CodingExamples;

import java.util.*;

public class StringOccurence {
    public static void main(String[] args) {
        String str = randomSentenceGenerator();
        System.out.println("Random Generated String is:::" + " " + str);
        System.out.println("String Occurence Count is" + " " + stringOccurenceCount(str));
    }

    private static int stringOccurenceCount(String str) {
        int count = 0;
        String[] string = str.split(" ");
        for (String s : string) {
            if (s.equals("test")) {
                count++;
            }
        }
        return count;
    }

    public static String randomSentenceGenerator() {
        String[] name = {"test", "Deb"};
        String[] action = {"test", "soccer"};
        int actionLength = action.length;
        List<String> randomNames = new ArrayList<>(Arrays.asList(name));
        Collections.shuffle(randomNames);
        int randAction = (int) (Math.random() * actionLength);
        String phrase1 = randomNames.get(0);
        String phrase2 = action[randAction];
        String phrase3 = randomNames.get(1);
        return phrase1 + " " + phrase2 + " " + phrase3 + " " + phrase3 + " " + phrase2;
    }
}