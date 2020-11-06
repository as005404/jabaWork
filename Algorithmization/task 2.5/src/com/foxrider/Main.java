package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;
// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
// 1 1 1 1
// 2 2 2 0
// 3 3 0 0
// 4 0 0 0
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        // Task 2.4
        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <N-i; j++) {
                A[i][j] = i+1;
            }

        }

        System.out.print(Arrays.deepToString(A));
    }
}
