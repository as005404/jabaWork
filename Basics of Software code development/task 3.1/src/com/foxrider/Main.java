package com.foxrider;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialization of scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Input some Number: ");
        int x = 0;
        try {
            x = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("Sorry, can you print number that in integer ranges");
            return;
        }

        int sum = 0;

        for (int i = 1; i<x;i++){
            try{
                sum+=i;
            }
            catch (Exception e){
                System.out.println("Out of bounds while counting sum. last value of sum is"+ sum);
            }
        }

        System.out.println("Sum is "+sum);

    }
}
