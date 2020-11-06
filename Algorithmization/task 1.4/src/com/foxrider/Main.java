package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;
//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
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

        int minInd = -1,maxInd = -1;
        double maxValue = Double.MIN_VALUE,minValue = Double.MAX_VALUE;
        for (int i = 0; i<A.length;i++) {
            if(A[i]>maxValue){
                maxInd = i;
                maxValue = A[i];
            }
            if(A[i]<minValue){
                minInd = i;
                minValue = A[i];
            }
        }

        double tmp = A[minInd];
        A[minInd] = A[maxInd];
        A[maxInd] = tmp;

        System.out.println(Arrays.toString(A));


    }

}

