package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//1 2 3 4
//4 3 2 1
//1 2 3 4
//4 3 2 1
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        // Task 2.4
        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            if(i%2==0){
                for (int j = 0; j < N; j++) {
                    A[i][j] = j+1;
                }
            }else{
                for (int j = 0, k = N; j < N; j++,k--) {
                    A[i][j] = k;
                }
            }
        }

        System.out.print(Arrays.deepToString(A));
    }
}
