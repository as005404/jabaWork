package com.foxrider;

import java.util.Scanner;
// Найти положительные элементы главной диагонали квадратной матрицы
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initialization of 2-dim Array
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i==j && A[i][j]>0){
                    System.out.print(A[i][j]+" ");
                }
            }
        }
    }
}
