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
                A[i][j] = (int)(random()*100);
            }
        }
        int m = max(A);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(j%2==1){
                    A[i][j]=m;
                }
            }
        }

        System.out.println(Arrays.deepToString(A));

    }
    static int max(int[][]arr){
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>m){
                    m = arr[i][j];
                }
            }
        }
        return m;
    }
}
