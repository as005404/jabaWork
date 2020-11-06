package com.foxrider;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;
// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.
public class Main {

    public static void main(String[] args) {
        // Task 4.13
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];


        Random r = new Random(877);
        for (int i = 0; i < n; i++) {
            arr[i] = n+i;
        }

        System.out.println(Arrays.toString(arr));

        twins(arr);
    }

    static void twins(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(abs(arr[j]-arr[i])==2){
                    System.out.println("twins: " + arr[i]+ " "+ arr[j]);
                }
            }
        }
    }
}
