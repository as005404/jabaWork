package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = sc.nextInt();

        System.out.println(Arrays.toString(arrFromNumber(a)));

    }

    static int[] arrFromNumber(int num){
        String str = Integer.toString(num);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }
}
