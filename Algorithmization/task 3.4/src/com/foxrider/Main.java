package com.foxrider;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;
//Сортировка обменами. Дана последовательность чисел
//a1 Сортировка обменами. Дана последовательность чисел
//a1 <= a2 <=...<= an
//.Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа
// a(i) и a(a+1)
//. Если ai > ai+1, то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок. a2  an
//.Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа
//i i+1 a и a. Если ai  ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
public class Main {

    public static void main(String[] args) {
        // Task 3.4
        int[] arr = new int[50];


        Random r = new Random(3129);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("number of swapes is: " + bubbleSort(arr));

        System.out.println(Arrays.toString(arr));
    }

    static int bubbleSort(int [] arr){
        int numberOfSwap = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j+1]<arr[j]) {
                    swap(arr, j, j + 1);
                    numberOfSwap++;
                }
            }
        }
        return numberOfSwap;
    }

    static void swap(int [] arr, int pos1, int pos2){
        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }
}
