package com.foxrider;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int N = sc.nextInt();

        //Initialization of Array
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }


        //Initialization of K
        System.out.print("Enter K: ");
        int K = sc.nextInt();

        for (int a:A)
            if(a%K==0)
                System.out.println(a);

    }

}