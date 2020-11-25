package Basics_of_software_code_development;

import java.util.Arrays;

public class Branching {
    public static void main(String[] args) {
        System.out.println(taskThree(1,0,2,0,3,0));
        System.out.println(2.3/1.1);
    }

    static void taskOne(double a, double b) {
        if (a > 0 && b > 0) {
            double c = 180 - (a + b);
            if (c > 0) {
                System.out.print("Треугольник существует");
                if (a == 90 || b == 90 || c == 90) {
                    System.out.println(", он прямоугольный.");
                } else System.out.println(", он не прямоугольный.");
            }
        } else System.out.println("Треугольник не существует");
    }

    static double taskTwo(double a, double b, double c, double d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }

    static boolean taskThree(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((areEqual(x1, x2) && areEqual(x2, x3)) ||(areEqual(y1, y2) && areEqual(y2, y3))){
            return true;
        } else try {
            return areEqual ((y3 - y1*1.0) / (y2 - y1*1.0), ((x3 - x1*1.0) / (x2 - x1*1.0)))  ;
        } catch (ArithmeticException e) {
            return false;
        }
    }

    static boolean areEqual(double a, double b){ //made only for taskThree
        return Math.abs(a-b) <= 1e-10;
    }

    static boolean taskFour(double A, double B, double x, double y, double z) {
        Double[] brickSides = new Double[]{x, y, z};
        Arrays.sort(brickSides);
        Double[] portSides = new Double[]{A, B};
        Arrays.sort(portSides);
        return (brickSides[0] < portSides[0]) && (brickSides[1] < portSides[1]);
    }

    static double taskFive(double x) {
        if (x <= 3) {
            return x * x - 3 * x + 9;
        } else return 1 / (x * x * x + 6);
    }
}
