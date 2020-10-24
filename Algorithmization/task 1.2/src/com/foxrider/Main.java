package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Initialization of array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int N = sc.nextInt();

        //Initialization of Array
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }


        //Initialization of Z
        System.out.print("Enter Z: ");
        int Z = sc.nextInt();
        int count = 0;


        for (int i = 0; i < A.length; i++) {
            if(A[i]>Z) {
                A[i] = Z;
                count++;
            }
        }

        System.out.println(Arrays.toString(A)+" count: "+count);

    }
}
