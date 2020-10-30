package com.foxrider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of points: ");
        int n = sc.nextInt();

        int x[] = new int[n];

        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter number: ");
            x[i] = sc.nextInt();
        }

        System.out.println(sumOfThreeNum(x,1,3));
    }

    static int sumOfThreeNum(int[]arr, int k, int m){
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum+=arr[i];
        }

        return sum;
    }
}
