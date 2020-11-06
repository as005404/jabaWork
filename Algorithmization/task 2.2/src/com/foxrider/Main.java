package com.foxrider;

import java.util.Scanner;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
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

        //Task 2.2
        printDiagonalElems(A);

    }

    static void printDiagonalElems(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
