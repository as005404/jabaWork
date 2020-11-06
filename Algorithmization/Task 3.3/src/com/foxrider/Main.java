package com.foxrider;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
// Сортировка выбором. Дана последовательность чисел
//a1 <= a2 <=...<= an
//.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.
public class Main {

    public static void main(String[] args) {
        // Task 3.3
        int[] arr = new int[50];


        Random r = new Random(3129);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50);
        }

        System.out.println(Arrays.toString(arr));

        chooseSort(arr);

        System.out.println(Arrays.toString(arr));


    }

    static void chooseSort(int [] arr){
        for (int i = 0, j = arr.length-1; i <= j; i++,j--) {
            swap(arr,i,max(arr,i,j));
            swap(arr,j,min(arr,i,j));
        }
    }

    static int min(int [] arr,int beg, int end){
        int min = arr[beg];
        int index = beg;

        for (int i = beg;i<=end;i++) {
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    static int max(int [] arr, int beg, int end){
        int max = arr[beg];
        int index = beg;

        for (int i = beg;i<=end;i++) {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    static void swap(int [] arr, int pos1, int pos2){
        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }
}
