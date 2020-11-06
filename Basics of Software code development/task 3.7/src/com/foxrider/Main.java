package com.foxrider;

import java.util.Scanner;
// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
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
