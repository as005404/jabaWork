package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initialization of 2-dim Array
        System.out.print("Enter height: ");
        int M = sc.nextInt();
        System.out.print("Enter length: ");
        int N = sc.nextInt();

        Integer A[][] = new Integer[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }


        //Task 2.1
        for (int i = 0; i < N; i++) {
            if(i%2==1 && A[0][i] > A[M-1][i]){
                for (int j = 0; j < M; j++) {
                    System.out.println(A[j][i]);
                }
            }
        }
        //System.out.print(Arrays.deepToString(A));
    }


}
