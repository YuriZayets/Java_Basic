package Algorithmization;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class One_dimensional_arrays {

    public static void main(String[] args) {

    }

    static int taskOne(int[] N, int K){
        int sum = 0;
        for (int t: N
             ) {
            if (t%K == 0){
                sum +=t;
            }
        }
        return sum;
    }

    static void taskTwo(double[] arr, double Z){
        int swaps=0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > Z){
                arr[i] = Z;
                swaps++;
            }
        }
        System.out.println("Итоговый массив :");
        for (double t: arr
             ) {
            System.out.print(t + "  ");
        }
        System.out.println("\nКоличество замен : " + swaps);
    }

    static void taskThree(double ... seq){
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (double v : seq) {
            if (v > 0) {
                positive++;
            } else if (v < 0) {
                negative++;
            } else zeros++;
        }
        System.out.printf("В массиве %d положительных чисел, %d отрицательный чисел и %d нолeй", positive, negative, zeros);
    }

    static double[] taskFour(double ... seq){
    double minValue = seq[0];
    double maxValue = seq[0];
    int minIndex = 0;
    int maxIndex = 0;
        for (int i = 1; i < seq.length; i++) {
            if (seq[i] > maxValue) {
                maxValue = seq[i];
                maxIndex = i;
            } else if (seq[i] < minValue) {
                minValue = seq[i];
                minIndex = i;
            }
        }
            double temp = seq[minIndex];
            seq[minIndex] = seq[maxIndex];
            seq[maxIndex] = temp;
            return seq;
    }

    static void taskFive(int... seq){
        for (int i = 0; i < seq.length; i++){
            if (seq[i] > i){
                System.out.println(seq[i]);
            }
        }
    }

    static double taskSix(double... seq){
        double sum = 0;
        BigInteger bigInteger;
        boolean probablePrime;
        for (int i = 0; i < seq.length; i++){
            bigInteger = BigInteger.valueOf(i);
            probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
            if (probablePrime){
                sum += seq[i];
            }
        }
        return sum;
    }

    static double taskSeven(double... seq){
        if (seq.length %2 != 0){
            System.out.println("Вы ввели нечётное количество элементов, значение в сердине массива не участвует в расчёте");
        }
        double max = seq[0] + seq[seq.length -1];
        for (int i = 0; i < seq.length/2; i++){
            double temp = seq[i] + seq[seq.length - 1 - i];
            if (temp > max){
                max = temp;
            }
        }
        return max;
    }

    static int[] taskEight(int... seq){
        ArrayList<Integer> seqSorted = new ArrayList<>();
        int min = seq[0];
        if (seq.length > 1){
            //finding minimum Value
            for (int i : seq){
                if (min > i)
                    min = i;
            }
            //excluding min matches
            for (int i : seq)
            {
                if (i != min)
                {
                    seqSorted.add(i);
                }
            }
        }
        return seqSorted.stream().mapToInt(i -> i).toArray();
    }

    static int taskNine(int... seq) {
        List<Integer> arr = IntStream.of(seq).boxed().collect(Collectors.toList());
        Map<Integer, Integer> frequencies = new HashMap<>();
        //creating Map with numbers as a key and its repeats as value
        for (Integer q : arr) {
            if (frequencies.containsKey(q)) {
                frequencies.put(q, frequencies.get(q) + 1);
            } else {
                frequencies.put(q, 1);
            }
        }
        //finding most repeats
        int maxAmount = frequencies.values().stream().max(Integer::compare).orElse(0);
        //sorting to get smallest ints checked first
        Collections.sort(arr);
        //returning first match
        for (int t: arr) {
        if (frequencies.get(t) == maxAmount){
            return t;
        }
        }
        return 0;
    }

    static int[] taskTen(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            if (i % 2 != 0){
                arr[i] = 0;
            }
        }
        return arr;
    }


}
