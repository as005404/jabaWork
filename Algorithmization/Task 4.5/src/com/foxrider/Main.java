package com.foxrider;

import java.util.Arrays;
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

        System.out.println(secondAfterMax(x));

    }

    static int secondAfterMax(int[] arr){
        int i = max(arr);
        int cp[] = Arrays.copyOf(arr,arr.length);
        cp[i] = 0;
        return max(cp);
    }

    static int max(int [] arr){
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0;i<arr.length;i++) {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
