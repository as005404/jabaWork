package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

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

        RowSortASC(A);
        System.out.print(Arrays.deepToString(A));

        RowSortDESC(A);
        System.out.print(Arrays.deepToString(A));


    }
    static void RowSortASC(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
    }
    static void RowSortDESC(int arr[][]){
        RowSortASC(arr);
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < ceil(arr[i].length/2.0); j++) {
                tmp = arr[i][arr[i].length-j-1];
                arr[i][arr[i].length-j-1] = arr[i][j];
                arr[i][j] = tmp;
            }
        }

    }
}
