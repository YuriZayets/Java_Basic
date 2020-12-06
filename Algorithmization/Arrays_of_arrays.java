package Algorithmization;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_of_arrays {
    public static void main(String[] args) {

    }

    static void taskOne(int[][] mat) {
        int height = mat.length;
        int width = mat[0].length;

        for (int column = 1; column < width; column +=2 ) {
            if (mat[0][column] > mat[height - 1][column]) {
                for (int[] ints: mat) {
                    System.out.println(ints[column]);
                }
            }
            System.out.println();
        }
    }

    static void taskTwo(int[][] mat){
        int count = 0;
        for (int[] i: mat) {
            System.out.println(i[count]);
            if (count < mat[0].length-1) count++;
        }
    }

    static void taskThree(int[][] mat, int k, int p){
        for (int i = 0; i < mat[0].length; i++){
            System.out.print(mat[k][i] + " ");
        }
        System.out.println("\n");
        for (int[] i: mat) {
            System.out.println(i[p]);
        }
    }

    static void taskFour(int m){
        int n = Math.abs(m);
        int[][] a = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i%2!=0){
                    a[i-1][j-1] = j;
                } else {
                    a[i-1][j-1] = n - j + 1;
                }
            }
        }
        //printing
        printMatrix(a);
    }

    static void taskFive(int n) {
        int[][] mat = new int[n][n];
        int count = 1;
        for (int[] i : mat) {
            for(int column = 0; column < n+1-count; column++){
                i[column]=count;
            }
            count++;
        }
        //printing
        printMatrix(mat);
    }

    static void taskSix(int n){ // в задании сказано что n - чётное, но думаю что это описка, иначе не ясно что должно происходить в центре матрицы
        int[][] mat = new int[n][n];
        int count = 0;
        boolean reachedMiddle = false;
        for (int[] i : mat) {
            for(int column = count; column < n-count; column++){
                i[column]=1;
            }
            count++;
            if (count>n/2) reachedMiddle = true;
            if (reachedMiddle) count-=2;
        }
        //printing
        printMatrix(mat);
    }

    static void taskSeven(int n){
        double[][] mat = new double[n][n];
        int countPositive = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                double temp = (i*i*1.0 - j*j)/n;
                mat[i][j] = Math.sin(temp);
                if (mat[i][j]>0) countPositive++;
            }
        }
        //printing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.2f  ", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("Положительных чисел в таблице : " + countPositive);
    }

    static void taskEight(int[][] mat){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите по-одному номера столбцов");
        int a = 0, b = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println(" Уб***ок, м**ь твою, а ну иди сюда, г***о собачье, решил ко мне лезть?" +
                    "Ты, за***нец вонючий, м**ь твою, а? Ну иди сюда, попробуй меня крашнуть, я тебя сам крашну, уб***ок!");
            e.printStackTrace();
        }
        int[] temp = new int[mat.length];
        int count = 0;
        for (int[] i: mat) {
            temp[count] = i[a];
            count++;
        }
        System.out.println(Arrays.toString(temp));

        count = 0;
        for (int j = 0; j <mat[b].length; j++){
            mat[count][a] = mat[count][b];
            mat[count][b] = temp[count];
            count++;
        }
        printMatrix(mat);
    }

    static int taskNine(int[][] mat){
        int[] columnsSum = new int[mat.length];
        int sum;
        for (int j = 0; j < mat[0].length ; j++){
            sum = 0;
            for (int[] ints : mat) {
                sum += ints[j];
            }
            columnsSum[j] = sum;
        }
        System.out.println(Arrays.toString(columnsSum));
        int max = 0;
        for (int i = 0 ; i < columnsSum.length; i++) {
            if (columnsSum[i] > columnsSum[max]) max = i;
        }
        System.out.println("Столбец # " + max + " Содержит максимальную сумму элементов равную : " + columnsSum[max]);
        return max;
    }

    static void taskTen(int[][] mat){
        List<Integer> positives = new ArrayList<>();
        for (int i = 0; i < mat.length ; i++){
            if (mat[i][i] > 0){
                positives.add(mat[i][i]);
            }
        }
        System.out.println(positives.toString());
    }

    static void taskEleven(){
        int[][] mat = new int[10][20];
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = (int) (Math.random() * 16);
            }
        }
        List<Integer> fivesCounter = new ArrayList<>();
        int count;
        for (int i = 0; i < 10; i++) {
            count = 0;
            for (int j = 0; j < 20; j++) {
                if (mat[i][j] == 5) count++;
                if (count == 3){
                    fivesCounter.add(i);
                    count = -15;
                }
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("Строки с больше чем тремя цифрами 5 : " + fivesCounter.toString());
    }

    static void taskTwelve(int[][] mat){
        int temp;
        for (int[] i : mat){
            for (int j = 0 ; j < i.length ; j++){
                for (int k = 0 ; k < i.length - j - 1 ; k++){
                    if (i[k] > i[k+1]) {
                        temp = i[k+1];
                        i[k+1] = i[k];
                        i[k] = temp;
                    }
                }
            }
        }
        System.out.println("По возрастанию");
        printMatrix(mat);

        for (int[] i : mat){
            for (int j = 0 ; j < i.length ; j++){
                for (int k = 0 ; k < i.length - j - 1 ; k++){
                    if (i[k] < i[k+1]) {
                        temp = i[k+1];
                        i[k+1] = i[k];
                        i[k] = temp;
                    }
                }
            }
        }
        System.out.println("\nПо убыванию");
        printMatrix(mat);
    }

    static void taskThirteen(int[][] mat){
        int temp;
        for (int i = 0 ; i < mat[0].length ; i++){
            for (int j = 0 ; j < mat.length ; j++){
                for (int k = 0 ; k < mat.length - j - 1 ; k++){
                    if (mat[k][i] > mat[k+1][i]) {
                        temp = mat[k+1][i];
                        mat[k+1][i] = mat[k][i];
                        mat[k][i] = temp;
                    }
                }
            }
        }
        //printing
        System.out.println("По возрастанию");
        printMatrix(mat);

        for (int i = 0 ; i < mat[0].length ; i++){
            for (int j = 0 ; j < mat.length ; j++){
                for (int k = 0 ; k < mat.length - j - 1 ; k++){
                    if (mat[k][i] < mat[k+1][i]) {
                        temp = mat[k+1][i];
                        mat[k+1][i] = mat[k][i];
                        mat[k][i] = temp;
                    }
                }
            }
        }
        //printing
        System.out.println("\nПо убыванию");
        printMatrix(mat);
    }

    static void taskFourteen(int m, int n) {
        if ( n > m ){
            System.out.println("Параметр n не может быть больше параметра m поскольку будет\n необходимо разместить в столбце больше единиц чем в нём есть мест");
        }
        int position;
        List<Integer> list = new ArrayList<>();
        int[][] mat = new int[m][n];
        for (int j = 1 ; j < n ; j++){ //сменяем столбцы массива
            for (int k = j; k > 0 ; k--){ //счётчик количества вставляемых в толбец элементов
                do {
                    position = (int)(Math.random()*m); //получаем случайный номер строки для вставки
                } while (list.contains(position)); //для матриц очень больших размеров плохое решение
                list.add(position);
            }
            for (int l: list) { //вставляем элементы на позиции
                mat[l][j] = 1;
            }
            list = new ArrayList<>(); //возможно не самое элегантное решение для сброса, возможно стоило ипользовать Array и Array.fill(), но хотелось спать
        }
        printMatrix(mat);
    }

    static void taskFifteen(int[][] mat) {
        int max = mat[0][0];
        //finding max element
        for (int[] ints : mat) {
            for (int anInt : ints) {
                if (anInt > max) max = anInt;
            }
        }

        //exchanging odd to max
        for (int[] ints : mat) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j]%2 != 0 ) ints[j] = max;
            }
        }

        printMatrix(mat);
    }

    static void taskSixteen(int n){
        if (n<=2 || n%6 == 0 || n == 10 || n >= 14){
            System.out.println("Магические квадраты такой размерности довольно сложные и вряд ли имеет смысл их решать в качестве одной из 50 учебных задач");
        }
        int[][] matrix = new int[n][n];
        if (n%4 == 0){
            int count = 1;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = count;
                    count++;
                }
            }
// Перестановка элементов главной диагонали
            count = 0;
            for (int i = 0; i < matrix.length/2; i++) {
                int transition;
                if(i<matrix.length/2) {
                    transition = matrix[i][i];
                    matrix[i][i] = matrix[matrix.length-1-count][matrix.length-1-count];
                    matrix[matrix.length-1-count][matrix.length-1-count] = transition;
                    count++;
                }
            }
// Перестановка элементов побочной диагонали
            count = 0;
            for (int i = 0; i <matrix.length/2 ; i++) {
                int transition;
                if(i<matrix.length/2){
                    transition = matrix[matrix.length - 1 -count][i];
                    matrix[matrix.length - 1 - count][i] = matrix[i][matrix.length-1-count];
                    matrix[i][matrix.length-1-count] = transition;
                    count++;
                }
            }
        } else if (n%2!= 0){
            int number = 1;
            int row = 0;
            int column = n / 2;
            int curr_row;
            int curr_col;
            while (number <= n * n) {
                matrix[row][column] = number;
                number++;
                curr_row = row;
                curr_col = column;
                row -= 1;
                column += 1;
                if (row == -1) {
                    row = n - 1;
                }
                if (column == n) {
                    column = 0;
                }
                if (matrix[row][column] != 0) {
                    row = curr_row + 1;
                    column = curr_col;
                    if (row == -1) {
                        row = n - 1;
                    }
                }
            }
        }
        printMatrix(matrix);
    }

    static void printMatrix(int[][] mat){
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt );
            }
            System.out.println();
        }
    }
}

