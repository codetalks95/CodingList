package CodingBat.String3;

public class MaxBlocks {
    public static void main(String[] args) {
        System.out.println("Max Blocks Ends Logic  is::" + maxBlocks("hoopla"));
    }

    public static int maxBlocks(String str) {
        if (str.length() == 0) return 0;

        int largest = 0;
        int current = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                if (current > largest) largest = current;
                current = 1;
            } else {
                current++;
            }
        }
        return Math.max(largest, current);
    }
}
