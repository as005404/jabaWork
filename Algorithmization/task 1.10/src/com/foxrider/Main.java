package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;
//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int N = sc.nextInt();

        //Initialization of Array
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        shiftEvery2ElemArray(A);

        System.out.print(Arrays.toString(A));
    }


    //method that shifts every second element and last elems are zeros
    public static void shiftEvery2ElemArray(int [] arr){
        for (int i = 1; i < Math.ceil((float)arr.length/2); i++) {
            arr[i] = arr[i*2];
            arr[i*2] = 0;
        }

        for (int i = (int) Math.ceil((float)arr.length/2); i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}
