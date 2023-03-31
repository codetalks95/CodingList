package CodingExamples;

import java.util.ArrayList;
import java.util.List;

public class RemoveYak {
    public static void main(String[] args) {
        String[] str = {"yakpak","pakyak","yak123ya"};
        System.out.println("Three Copies converted::" + removeYak(str));
    }

    private static List<String> removeYak(String[] str) {
        List<String> stringList = new ArrayList<>();
        for (String sElement : str) {
            stringList.add(sElement.replace("yak",""));
        }
        return stringList;
    }
}

