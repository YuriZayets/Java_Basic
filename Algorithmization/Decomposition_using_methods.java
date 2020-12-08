package Algorithmization;

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
        int min = Math.min(x, Math.min(y, Math.min(z, t)));
        int result = 1;
        for (int i = 2; i <= min; i++) {
            if (x % i == 0) {
                if (y % i == 0) {
                    if (z % i == 0) {
                        if (t % i == 0) {
                            result = i;
                        }
                    }
                }
            }
        }
        return result;
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
        int almostMax = array[0];
        for (int i : array) {
            if (i > max) {
                almostMax = max;
                max = i;
            }
        }
        return almostMax;
    }

    static boolean taskSix(int a, int b, int c) {
        return NOD(a, b) == 1 && NOD(b, c) == 1 && NOD(a, c) == 1;
    }

    static int NOD(int n, int m) { //used in taskSix
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
        for (int i = 1; i < N; i++) {
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
            if (!areComposite(i, i + 2)) {
                System.out.println("Близнецы " + i + " : " + (i + 2));
            }
        }
    }

    static boolean areComposite(int a, int b) { //used in task Thirteen
        boolean isAComposite = false;
        boolean areComposite = false;
        for (int i = 2; i < a; i++) {
            //System.out.println("i " + i);
            if (a % i == 0) {
                isAComposite = true;
                break;
            }
        }
        if (!isAComposite) {
            for (int i = 2; i < b; i++) {
                if (b % i == 0) {
                    areComposite = true;
                    break;
                }
            }
            return areComposite;
        }
        return true;
    }

    static void taskFourteen(int n) {
        List<Integer> armstrongNumbers = new ArrayList<>();
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (isArmstrong(i, n)) {
                armstrongNumbers.add(i);
            }
        }
        System.out.println(armstrongNumbers.toString());
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
        int count;
        int result;
        for (int i = 1; i <= 10 - n; i++) {
            result = 0;
            count = i;
            for (int j = n - 1; j >= 0; j--) {
                result += count * Math.pow(10, j);
                count++;
            }
            amazingDecomposition(result);
        }
    }

    static void amazingDecomposition(int result) { //used in taskFifteen
        System.out.println(result);
    }

    static void taskSixteen(int n) {
        long result = (long) (((Math.pow(10, n) - Math.pow(10, n - 1)) / 4) * (Math.pow(10, n - 1) + Math.pow(10, n)));
        System.out.println("Сумма нечетных элементов равна : " + result);
        System.out.println("Количество чётных элементов в этом числе равно : " + evenInNumberCounter(result));
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
            n = digitInNumberSummator(n);
            count++;
        } while (n != 0);
        System.out.println(count);
    }

    static int digitInNumberSummator(long number) { //used in taskSeventeen
        int sum = 0;
        for (; number > 10; number /= 10) {
            sum += number % 10;
        }
        return sum;
    }
}
