package CodingExamples.Boolean;

public class MakeBricks {
    public static void main(String[] args) {
        int smallBrick = 1;
        int bigBrick = 5;
        int goal = 13;
        int smallBrickQty = 3;
        int bigBrickQty = 2;
        System.out.println(makeBricks(smallBrick, smallBrickQty, bigBrick, bigBrickQty, goal));
    }

    private static boolean makeBricks(int smallBrick, int smallBrickQty, int bigBrickQty, int bigBrick, int goal) {
        return smallBrick * smallBrickQty + bigBrick * bigBrickQty == goal;
    }
}
