package com.foxrider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Initialization of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bounds of range: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a;i<=b;i++){
            System.out.print(i+": ");
            for(int j = 2; j<=i-1; j++){
                if(i%j==0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

    }
}
