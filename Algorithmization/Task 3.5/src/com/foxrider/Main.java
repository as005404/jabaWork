package com.foxrider;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        // Task 3.5
        int[] arr = new int[50];


        Random r = new Random(877);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50);
        }

        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int ind = binarySearch(arr,0,i-1,key);

            if(i == ind + 1){
                if(arr[i]<arr[i-1])
                    swap(arr, i-1,i);
            }
            else if (i - ind > 0) {
                System.arraycopy(arr, ind, arr, ind + 1, i - ind);
                arr[ind] = key;
            }

        }
    }


    static int binarySearch(int[]arr,int beg,int end,int key){
        int index = -1;
        int b = beg;
        int e = end;

        if(key<arr[beg])
            return beg;


        while (true) {
            // throw the remainder
            int midPoint = (int) ceil((b+e)/2.0);

            if(abs(e-b)<=1){
                return max(b,e);
            }

            if(key<arr[midPoint]){
                e = midPoint;

            }else if(key>arr[midPoint]){
                b = midPoint;
            }
            else{
                return midPoint;
            }


        }
    }
    static void swap(int [] arr, int pos1, int pos2){
        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }
}
