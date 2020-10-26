package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initialization of 2-dim Array
        System.out.print("Enter height: ");
        int N = sc.nextInt();
        System.out.print("Enter length: ");
        int M = sc.nextInt();

        int A[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        //Task 2.3
        System.out.print("Write row number k: ");
        int k = sc.nextInt();
        System.out.print("\nWrite column number p: ");
        int p = sc.nextInt();

        printRow(A,k);
        printColumn(A,p);

    }
    static void printColumn(int [][]arr,int colNum){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][colNum]+" ");
        }
    }

    static void printRow(int [][]arr,int rowNum){
        System.out.println(Arrays.toString(arr[rowNum]));
    }
}
