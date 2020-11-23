package Basics_of_software_code_development;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Basic_Cycles {

    public static void main(String[] args) {
    }

    static int taskOne(int x){
        if (x<= 0) {
            System.out.println("Х должен быть положительным, будет возращён -1");
            return 0;
        }
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }

    static void taskTwo (int a, int b, int h){
       for (int i = a; i <= b; i += h ){
           if (i>2){
               System.out.println("Корень : " + i);
           } else {
               System.out.println("Корень : " + (-i));
           }
       }
    }

    static int taskThree (){
        int result = 0;
        for (int i = 1; i <= 100; i++){
            result += i*i;
        }
        return result;
    }

    static BigInteger taskFour (){
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++){
            result = result.multiply(BigInteger.valueOf(i*i));
        }
        return result;
    }

    static void taskFive (){
        for (int i = 0; i <= 255; i++){
            char ch = (char) i;
            System.out.printf("Символ %c, его численное значение %d \n" , ch, i);
        }
    }

    static void taskSix (){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите значение m и n каждое с новой строки");

        try {
            int m = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());
            for (int i = Math.min(m,n) ; i <= Math.max(m,n); i++){
                for (int j = 2; j <= i-1; j++){
                    if (i % j == 0){
                        System.out.printf("Найден делитель для %d, который равняется %d \n", i, j);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void taskSeven (int a, int b){
        Set<Integer> set = new HashSet<>();
        for (int i = String.valueOf(a).length(); i >= 1; i--){
            set.add(a%10);
            a /= 10;
        }
        for (int i = String.valueOf(b).length(); i >= 1; i--){
            set.add(b%10);
            b /= 10;
        }
        for (int x : set){
            System.out.print(x + " ");
        }
    }
}
