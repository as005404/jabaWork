package com.foxrider;

import java.util.Scanner;
// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int N = sc.nextInt();

        //Initialization of Array
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Input some number i: ");
        double i = sc.nextDouble();

        for (int a:A) {
            if(a>i){
                System.out.print(a+" ");
            }

        }
    }
}
