package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sin;
//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры
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

        System.out.print("Enter index of 1'st column that u want to swap: ");
        int f = sc.nextInt();
        System.out.print("Enter index of 1'st column that u want to swap: ");
        int s = sc.nextInt();

        
        // Task 2.8
        System.out.println(Arrays.deepToString(A));
        swapColumn(A,f,s);
        
        System.out.println(Arrays.deepToString(A));

    }

    static void swapColumn(double[][]arr,int firstColumn, int secColumn){
        for (int i = 0; i < arr.length; i++) {

            double tmp = arr[i][firstColumn];
            arr[i][firstColumn] = arr[i][secColumn];
            arr[i][secColumn] = tmp;
        }
    }
}
