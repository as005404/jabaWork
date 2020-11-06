package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initialization of 2-dim Array
        System.out.print("Enter height: ");
        int N = sc.nextInt();
        System.out.print("Enter length: ");
        int M = sc.nextInt();

        int A[][] = new int[N][M];


        //Task 2.14
        int[] numberOfOnes = new int[M];
        for (int i = 0; i < numberOfOnes.length; i++) {
            numberOfOnes[i] = i;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(numberOfOnes[j]>0){
                    A[i][j] = 1;
                    numberOfOnes[j]--;
                }

            }
        }

        System.out.println(Arrays.deepToString(A));
    }

}
