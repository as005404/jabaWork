package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;
//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Initialization of 2-dim Array
        System.out.print("Enter height: ");
        int N = sc.nextInt();
        System.out.print("Enter length: ");
        int M = sc.nextInt();

        double A[][] = new double[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Task 2.8
        System.out.println(Arrays.deepToString(A));
        double sum[] = new double[M];
        fillMaxArray(A,sum);

        System.out.println(indexOfMax(sum));

    }

    static void fillMaxArray(double[][]arr, double[]sum){
        for (int i = 0; i < arr[0].length; i++){
            for (int j = 0; j < arr.length; j++) {
                sum[i] += arr[j][i];
            }
        }
    }
    static int indexOfMax(double[]sum){
        double max = Double.MIN_VALUE;
        int indexOfMax = -1;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i]>max){
                max = sum[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
}
