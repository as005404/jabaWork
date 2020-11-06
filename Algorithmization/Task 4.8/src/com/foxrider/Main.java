package com.foxrider;

import java.util.Scanner;
//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.
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
