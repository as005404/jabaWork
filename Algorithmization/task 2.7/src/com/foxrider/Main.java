package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;
// Сформировать квадратную матрицу порядка N по правилу:
// a[i,j] = sin((i^2 - j^2)/N)
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        // Task 2.7
        int count = 0;
        double A[][] = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <N; j++) {
                double tmp = sin((pow(i+1,2)-pow(j+1,2))/N);
                A[i][j] = tmp;
                if(tmp>0){
                    count++;
                }
            }
        }

        System.out.println(Arrays.deepToString(A));
        System.out.println("Number of positive elems is "+ count);
    }
}
