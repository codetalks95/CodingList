package SimpleJavaPrograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 371;
        if (armStrongNumber(number) == number) {
            System.out.println("It is a armStrong Number");
        } else {
            System.out.println("It is not a armStrong Number");
        }
    }

    private static int armStrongNumber(int number) {
        int count = 0;
        char[] chars = String.valueOf(number).toCharArray();
        for (char aChar : chars) {
            count += Math.pow(Integer.parseInt(String.valueOf(aChar)), 3);
        }
        return count;
    }
}
