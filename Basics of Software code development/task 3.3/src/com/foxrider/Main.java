package com.foxrider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1;i<=100;i++){
            sum+=Math.pow(i,2);
        }

        System.out.println("Sum of multiplication of first 100 numbers is " + sum);
    }
}
