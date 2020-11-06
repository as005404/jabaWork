package com.foxrider;

import java.util.Scanner;
/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 **/
public class Main {

    public static void main(String[] args) {
        // Initialization of Scanner
        Scanner sc = new Scanner(System.in);
        // input a
        System.out.println("Input x: ");
        double x =  sc.nextDouble();

        // input b
        System.out.println("Input y: ");
        double y = sc.nextDouble();

        // answer
        double z = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
        System.out.println(z);
    }
}
