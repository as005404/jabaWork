package com.foxrider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialization of Scanner
        Scanner sc = new Scanner(System.in);
        // input number
        System.out.println("Input real number in nnn.ddd format: ");
        Double x =  sc.nextDouble();

        String str = x.toString();

        int indexOfDot = str.indexOf('.');

        String DecimalPart = str.substring(0,indexOfDot);
        String RealPart = str.substring(indexOfDot+1);
        System.out.println(DecimalPart);
        System.out.println(RealPart);

    }
}
