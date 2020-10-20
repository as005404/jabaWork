package com.foxrider;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialization of Scanner
        Scanner sc = new Scanner(System.in);
        // input a
        System.out.println("Input a: ");
        double a =  sc.nextDouble();

        // input b
        System.out.println("Input b: ");
        double b = sc.nextDouble();

        // input c
        System.out.println("Input c: ");
        double c = sc.nextDouble();

        // answer
        double z = ((a-3)*b/2)+c;
        System.out.println(z);
    }
}
