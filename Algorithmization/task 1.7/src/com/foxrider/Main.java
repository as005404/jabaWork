package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int N = sc.nextInt();

        //Initialization of Array
        double A[] = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextDouble();
        }

        //From condition we know that length of arr is even number
        double [] B = new double[(int)N/2];
        for (int i = 0, j = A.length-1; i < A.length/2; i++,j--) {
            B[i] = A[i] + A[j];
        }
        System.out.println(Arrays.toString(B));
        System.out.print(max(B));
    }

    static double max(double []n){
        double max = Double.MIN_VALUE;
        for (double d:n) {
            if(d>max) {
                max = d;
            }
        }
        return max;
    }
}
