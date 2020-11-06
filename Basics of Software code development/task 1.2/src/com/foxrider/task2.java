package com.foxrider;

import java.util.Scanner;
/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 **/
public class task2 {
    public static void main(String[]args){
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
        double z = ((b + Math.sqrt(Math.pow(b,2) + 4*a*c))/(2*a)) - Math.pow(a,3)*c + Math.pow(b,-2);
        System.out.println(z);


    }
}
