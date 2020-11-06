package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;
//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.
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

        int zeroElems = 0;
        int negativeElems = 0;
        int positiveElems = 0;
        for (double d: A) {
            if (d > 0) {
                positiveElems++;
            } else {
                if (d < 0) {
                    negativeElems++;
                } else {
                    zeroElems++;
                }
            }
        }
        
        System.out.println("negative: "+negativeElems);
        System.out.println("positive: "+positiveElems);
        System.out.println("zero: "+zeroElems);
    }
}
