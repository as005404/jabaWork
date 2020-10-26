package com.foxrider;

import java.nio.BufferUnderflowException;
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
                A[i][j] = (int)round(random()*100);
            }
        }
        // initial values of matrix
        System.out.println(Arrays.deepToString(A));

        ColumnSortASC(A);
        System.out.println(Arrays.deepToString(A));

        ColumnSortDESC(A);
        System.out.println(Arrays.deepToString(A));


    }
    static void ColumnSortASC(int arr[][]){
        for (int i = 0; i < arr[0].length; i++) {
            BubbleSortASC(arr,i);
        }
    }
    static void ColumnSortDESC(int arr[][]){
        for (int i = 0; i < arr[0].length; i++) {
            BubbleSortDESC(arr,i);
        }
    }

    //sort column by ASC
    static void BubbleSortASC(int[][]arr,int numOfColumn){
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length - i -1; j++) {
                    if (arr[j][numOfColumn]>arr[j+1][numOfColumn]){
                        int tmp = arr[j+1][numOfColumn];
                        arr[j+1][numOfColumn] = arr[j][numOfColumn];
                        arr[j][numOfColumn] = tmp;
                    }
                }
            }
        }

    static void BubbleSortDESC(int[][]arr,int numOfColumn){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j][numOfColumn]<arr[j+1][numOfColumn]){
                    int tmp = arr[j+1][numOfColumn];
                    arr[j+1][numOfColumn] = arr[j][numOfColumn];
                    arr[j][numOfColumn] = tmp;
                }
            }
        }
    }
}
