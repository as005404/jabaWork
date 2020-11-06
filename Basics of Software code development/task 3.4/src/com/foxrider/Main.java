package com.foxrider;

import java.math.BigInteger;
// Составить программу нахождения произведения квадратов первых двухсот чисел
public class Main {

    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(1);

        for (int i = 1;i<=200;i++){
            BigInteger x = BigInteger.valueOf((long)Math.pow(i,2));
            sum = sum.multiply(x);
        }

        System.out.println("Sum of multiplication of first 100 numbers is " + sum);
    }
}
