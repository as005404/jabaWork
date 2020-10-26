package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        // Task 2.6
        int A[][] = new int[N][N];
        for (int i = 0,k = N-1; i < N/2; i++,k--) {
            for (int j = i; j <N-i; j++) {
                A[i][j] = 1;
                A[k][j] = 1;
            }
        }

        System.out.print(Arrays.deepToString(A));
    }
}
