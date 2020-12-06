package Algorithmization;

import java.util.Arrays;

public class Decomposition_using_methods {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,8,11,4,0};
        //System.out.println(taskFive(arr));
        //System.out.println(taskSix(4,7,9));
        //taskOne(27,9);
        //System.out.println(taskSeven());
        taskEight(arr,1,7);
    }

    static void taskOne(int a, int b){
        int NOD = NOD(a,b);
        int NOK = a*b/NOD;
        System.out.println("Наибольший общий делитель равен : " + NOD + " Наименьшее общее кратное : " + NOK);
    }

    static void taskTwo(){

    }

    static double taskThree(double a){
    double S = (Math.sqrt(3)/4)*a*a*1.0;
    return S*6;
    }

    static void taskFour(int...points){

    }

    static int taskFive(int[] array){
        int max = array[0];
        int almostMax = array[0];
        for (int i: array) {
            if (i > max){
                almostMax = max;
                max = i;
            }
        }
        return almostMax;
    }

    static boolean taskSix(int a, int b, int c){
        return NOD(a, b) == 1 && NOD(b, c) == 1 && NOD(a, c) == 1;
    }

    static int NOD(int n, int m){
        if (m > n) return NOD(m,n);
        if (m==0) return n;
        return NOD(m,n%m);
    }

    static int taskSeven(){
        int result=0;
        int temp;
    for(int i = 9; i >= 1; i -= 2){
        temp = i;
        for (int j = i-1; j >= 1; j--){
            temp *= j;
            }
        result += temp;
        }
    return result;
    }

    static void taskEight(int[] D, int k, int m){
        int[] result = new int[m-k-1];
        for (int j = 0; (k+2) <= m; j++){
        result[j] = D[k] + D[k + 1] + D[k + 2];
        k++;
        }
        System.out.println(Arrays.toString(result));
    }

    static void taskNine(){

    }

    static void taskTen(){

    }

    static void taskEleven(){

    }

    static void taskTwelve(){

    }

    static void taskThirteen(){

    }

    static void taskFourteen(){

    }

    static void taskFifteen(){

    }

    static void taskSixteen(){

    }

    static void taskSeventeen(){

    }
}
