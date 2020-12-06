package Algorithmization;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

    }

    static void taskOne(int[] first, int[] second, int k) {
        //не совсем понятно как для вставки увеличить размер массива не создавая новый массив, надеюсь через копии пойдёт
        //можно конечно принимать в качестве параметра динамический массив, но видимо задача не про это
        int spot = k;
        for (int value : second) {
            first = insertElement(first, spot, value);
            spot++;
        }
        System.out.println(Arrays.toString(first));
        }

    //used in taskOne
    static int[] insertElement(int[] arr, int spot, int added) {
        int[] result = Arrays.copyOf(arr, arr.length +1);
        if (result.length - 1 - spot >= 0){
            System.arraycopy(result, spot, result, spot + 1, result.length - 1 - spot);
        }
        result[spot] = added;
        return result;
    }

    static void taskTwo(int[] array) { //сортировка выбором
        int temp = 0;
        for (int left = 0; left < array.length; left++) {
            int min = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            if(left != min){
                swapElements(array, left, min);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //used in taskTwo, taskThree
    static void swapElements(int[] array, int item, int itemToSwap){
        int temp;
        temp = array[item];
        array[item] = array[itemToSwap];
        array[itemToSwap] = temp;
    }

    static void taskThree(int[] array) { //сортировка обменами
        int temp;
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swapElements(array, i, i-1);
                    isSorted = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static void taskFour(int[] array) { //сортировка вставками
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }

    static void taskFive(int[] array) { //сортировка Шелла
        int temp;
        int h = 0;

        while(h <= array.length/3)
            h = 3*h + 1;

        for(int k = h; k > 0; k = (k-1)/3)
            for(int i = k; i < array.length; i++)
            {
                temp = array[i];
                int j;
                for(j = i; j >= k; j -= k)
                {
                    if(temp < array[j - k])
                        array[j] = array[j - k];
                    else
                        break;
                }
                array[j] = temp;
            }
        System.out.println(Arrays.toString(array));
    }
    }

