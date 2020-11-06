package com.foxrider;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента
//a(i) и a(i+1). Если a(i) <= a(i+1), то продвигаются
//на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.
public class Main {

    public static void main(String[] args) {
        // Task 3.6
        //Initialization of Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("input length of array: ");
        int n = sc.nextInt();

        double[] arr = new double[n];

        Random r = new Random(877);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextDouble()*100;
        }

        System.out.println(Arrays.toString(arr));

        shellSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void shellSort(double [] arr) {
        for (int i = 0; i < arr.length-1;) {
            if ( arr[i] >arr[i + 1]) {
                swap(arr, i, i + 1);
                if(i!=0) i--;
            } else if(i<arr.length-1)
                i++;
        }
    }

    static void swap(double [] arr, int pos1, int pos2){
        var tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }

}
