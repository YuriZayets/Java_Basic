package Algorithmization;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decomposition_using_methods {
    public static void main(String[] args) {
    }

    static void taskOne(int a, int b) {
        int NOD = NOD(a, b);
        int NOK = a * b / NOD;
        System.out.println("Наибольший общий делитель равен : " + NOD + " Наименьшее общее кратное : " + NOK);
    }

    static int taskTwo(int x, int y, int z, int t) {
        int nod = NOD(x, y);
        nod = NOD(z, nod);
        nod = NOD(t, nod);
        return nod;
    }

    static double taskThree(double a) {
        double S = (Math.sqrt(3) / 4) * a * a * 1.0;
        return S * 6;
    }

    static void taskFour(double... points) {
        //предположил что точки приходят попарно в формате {x1,y1,x2,y2,x3,y3...}
        double maxDistance = 0;
        double tempDistance;
        int point = 0;
        for (int i = 0; i < points.length - 3; i += 2) {
            tempDistance = Math.sqrt(Math.abs(Math.pow((points[i + 2] - points[i]), 2) + Math.pow((points[i + 3] - points[i + 1]), 2)));
            if (tempDistance > maxDistance) {
                maxDistance = tempDistance;
                point = i;
            }
        }
        System.out.printf("Между точками под номерами %d и %d с координатами %.2f и %.2f\n" +
                "и точками под номерами %d и %d с координатами %.2f и %.2f\n" +
                "рассточние наибольшее", point, (point + 1), points[point], points[point + 1], (point + 2), (point + 3), points[point + 2], points[point + 3]);
    }

    static int taskFive(int[] array) {
        int max = array[0];
        int almostMax = Integer.MIN_VALUE;
        for (int j : array) {
            if (j >= max) {
                max = j;
            } else if (j > almostMax) {
                almostMax = j;
            }
        }
        return almostMax;
    }

    static boolean taskSix(int a, int b, int c) {
        return NOD(a, b) == 1 && NOD(b, c) == 1 && NOD(a, c) == 1;
    }

    static int NOD(int n, int m) { //used in taskSix, taskOne, taskTwo
        if (m > n) return NOD(m, n);
        if (m == 0) return n;
        return NOD(m, n % m);
    }

    static int taskSeven() {
        int result = 0;
        int temp;
        for (int i = 9; i >= 1; i -= 2) {
            temp = i;
            for (int j = i - 1; j >= 1; j--) {
                temp *= j;
            }
            result += temp;
        }
        return result;
    }

    static void taskEight(int[] D, int k, int m) {
        int[] result = new int[m - k - 1];
        for (int j = 0; (k + 2) <= m; j++) {
            result[j] = D[k] + D[k + 1] + D[k + 2];
            k++;
        }
        System.out.println(Arrays.toString(result));
    }

    static double taskNine(double X, double Y, double Z, double T) {
        double diagonal = Math.sqrt(X * X + Y * Y);
        double sFirstTriangle = X * Y * 0.5;
        double halfPerimeter = (diagonal + Z + T) / 2;
        double sSecondTriangle = Math.sqrt(halfPerimeter * (halfPerimeter - diagonal) * (halfPerimeter - Z) * (halfPerimeter - T));
        return sFirstTriangle + sSecondTriangle;
    }

    static void taskTen(int N) {
        int[] intsInN = new int[String.valueOf(Math.abs(N)).length()];
        int count = 0;
        for (int a = intsInN.length - 1; a >= 0; a--, count++) {
            intsInN[count] = (int) (N / Math.pow(10, a));
            N = N % (int) (Math.pow(10, a));
        }
        System.out.println(Arrays.toString(intsInN));
    }

    static void taskEleven(int a, int b) {
        int aLength = String.valueOf(Math.abs(a)).length();
        int bLength = String.valueOf(Math.abs(b)).length();
        String answer = aLength > bLength ? "В числе a больше цифр" : "В числе b больше цифр";
        if (aLength == bLength) answer = "Количество цифр одинаковое";
        System.out.println(answer);
    }

    static void taskTwelve(int K, int N) {
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (K == sumOfNumbersInDigit(i)) {
                array.add(i);
            }
        }
        System.out.println(array.toString());
    }

    static int sumOfNumbersInDigit(long number) { //used in taskTwelve
        int sum = 0;
        for (; number > 0; number /= 10) {
            sum += number % 10;
        }
        return sum;
    }

    static void taskThirteen(int n) {
        for (int i = n; i <= 2 * n - 2; i++) {
            if (notComposite(i) && notComposite(i + 2)) {
                System.out.println("Близнецы " + i + " : " + (i + 2));
            }
        }
    }

    static boolean notComposite(int a) { //used in task Thirteen
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void taskFourteen(int k) {
        List<Integer> armstrongNumbers = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            if (isArmstrong(i, getIntLength(i))) {
                armstrongNumbers.add(i);
            }
        }
        System.out.println(armstrongNumbers.toString());
    }

    static int getIntLength(int i) { //used in taskFourteen
        int count = (i == 0) ? 1 : 0;
        while (i != 0) {
            count++;
            i /= 10;
        }
        return count;
    }

    static boolean isArmstrong(int number, int exponent) { //used in taskFourteen
        int i = number;
        boolean isArmstrong = false;
        int temp = 0;
        for (; number > 0; number /= 10) {
            temp += Math.pow(number % 10, exponent);
        }
        if (temp == i) {
            isArmstrong = true;
        }
        return isArmstrong;
    }

    static void taskFifteen(int n) {
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (isIncreasingSequence(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isIncreasingSequence(int result) { //used in taskFifteen
        int digit = result % 10;
        result /= 10;
        while (result != 0) {
            if (digit <= result % 10) {
                return false;
            }
            digit = result % 10;
            result /= 10;
        }
        return true;
    }

    static void taskSixteen(int n) {
        int result = 0;
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (areAllDigitsOdd(i)) {
                result+=i;
            }
        }
        System.out.println("Сумма элементов содержащих только нечётные числа равна : " + result);
        System.out.println("Количество чётных элементов в этом числе равно : " + evenInNumberCounter(result));
    }

    static boolean areAllDigitsOdd(int i) { //used in taskSixteen
        int digit = i % 10;
        while (i != 0) {
            i /= 10;
            if (digit % 2 == 0) {
                return false;
            }
            digit = i % 10;
        }
        return true;
    }

    static int evenInNumberCounter(long number) { //used in taskSixteen
        int count = 0;
        long temp;
        for (; number > 0; number /= 10) {
            temp = number % 10;
            if (temp % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static void taskSeventeen(long n) {
        int count = 0;
        do {
            n -= digitInNumberSummator(n);
            count++;
        } while (n != 0);
        System.out.println(count);
    }

    static int digitInNumberSummator(long number) { //used in taskSeventeen
        int sum = 0;
        for (; number > 0; number /= 10) {
            sum += number % 10;
        }
        return sum;
    }
}
