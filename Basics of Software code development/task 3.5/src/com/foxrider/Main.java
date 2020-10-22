package com.foxrider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Initialization of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n  = sc.nextInt();

        System.out.print("Enter some number e: ");
        int e  = sc.nextInt();

        double sum = 0;
        for(int i = 0;i<=n;i++){
            double z  = Math.abs(( 1 / Math.pow(2, i)) + (1 / Math.pow(3, i)));
            if(z >= e){
                sum+=z;
                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
