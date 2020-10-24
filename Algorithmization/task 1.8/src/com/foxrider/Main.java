package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int N = sc.nextInt();

        //Initialization of Array
        Integer A[] = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }


        int countOfMin = DeleteMins(A,Main.min(A));


        int B[] = new int[A.length-countOfMin];
        for(int i = 0, j = 0;i<A.length;i++ ){
            if(A[i]!=null){
                B[j++] = A[i];
            }
        }

        System.out.print(Arrays.toString(B));

    }

    static int min(Integer[] n){
        int min = Integer.MAX_VALUE;
        for (int d:n) {
            if(d<min) {
                min = d;
            }
        }
        return min;
    }

    static int DeleteMins(Integer[] arr,int min){
        int countOfMin = 0;
        for (int i = 0;i<arr.length;i++ ){
            if(arr[i] == min){
                arr[i] = null;
                countOfMin++;
            }
        }
        return countOfMin;
    }
}
