package CodingBat.String1;


public class MakeTags {
    public static void main(String[] args) {
        String[] strings = {"i", "Yay"};
        System.out.println("Result for Make Tags Logic::" + " " + makeTags(strings));
    }

    private static StringBuilder makeTags(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        if(strings.length == 2) {
            stringBuilder.append("<").append(strings[0]).append(">").append(strings[1]).append("</").append(strings[0]).append(">");
        }
        return stringBuilder;
    }
}