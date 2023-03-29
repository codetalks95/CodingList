package CodingExamples;

import java.util.Arrays;
import java.util.Random;

public class GenerateOTP {
    public static void main(String[] args) {
        int[] case1 = new int[5];
        Random random = new Random();
        for (int i = 0; i < case1.length; i++) {
            case1[i] = random.nextInt(10);
        }
        System.out.println("Random Numbers are::" + Arrays.toString(Arrays.stream(case1).toArray()));
        System.out.println("Generated OTP is::" + " " + generateOtp(case1, random.nextInt(10)));
    }

    private static String generateOtp(int[] case1, int i) {
        StringBuilder string = new StringBuilder(i);
        for (int j : case1) {
            string.append(j);
        }
        return string.toString();
    }
}
