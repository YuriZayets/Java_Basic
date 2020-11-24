package Basics_of_software_code_development;

public class Linear_programs {
    public static void main(String[] args) {
    }

    static double taskOne(double a, double b, double c) {
        return ((a - 3) * (b / 2)) + c;
    }

    static double taskTwo(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    static double taskThree(double x, double y) {
        double a = Math.toDegrees(x);
        double b = Math.toDegrees(y);
        return ((Math.sin(a) + Math.cos(b)) / (Math.cos(a) - Math.cos(b))) * Math.tan(a * b);
    }

    static double taskFour(double T) {
        int tempA = (int) T;
        double tempB = T - tempA;
        return (double) Math.round(((tempB * 1000) + (tempA / 1000.0)) * 1000d) / 1000d;
    }

    static void taskFive(int T) {
        int hours = T / 3600;
        int minutes = (T - hours * 3600) / 60;
        int sec = (T - hours * 3600) - minutes * 60;
        System.out.printf("%dч %dмин %dс.", hours, minutes, sec);
    }

    static void taskSix(int x, int y) {
        if ((x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4)) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
