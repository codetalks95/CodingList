package MathFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Random random = new Random();
        int b = random.nextInt(10);
        int a = random.nextInt(10);
        int c = random.nextInt(10);
        System.out.println("a=" + " " + a + " " + "b=" + " " + b + " " + "c=" + " " + c);
        System.out.println("Roots of Quadratic Equation are" + " " + generateRoots(b, a, c));
    }

    private static double rootsOfQuadraticEquation(int b, int a, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private static List<Double> generateRoots(int b, int a, int c) {
        List<Double> doubleList = new ArrayList<>();
        double determinant = rootsOfQuadraticEquation(a, b, c);
        System.out.println("Determinant is:" + " " + determinant);
        double v1 = (-b + Math.sqrt(determinant)) / 2 * a;
        double v2 = (-b - Math.sqrt(determinant)) / 2 * a;
        double v3 = 0;
        try {
            v3 = -b / (2 * a);
        } catch (Exception e) {
            System.out.println("Arithmetic Exception Occurred");
        }
        if (determinant > 0) {
            doubleList.add(v1);
            doubleList.add(v2);
        } else if (determinant == 0) {
            doubleList.add(v3);
        } else {
            doubleList.add(0.0);
        }
        return doubleList;
    }
}
