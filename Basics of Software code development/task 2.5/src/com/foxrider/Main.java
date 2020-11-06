package com.foxrider;

import java.util.Scanner;
//Вычислить значение функции:
public class Main {

    public static void main(String[] args) {
        // Initialization of scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = sc.nextDouble();

        if(x<=3){
            System.out.println(Math.pow(x,2) - 3*x + 9);
        }
        else
            System.out.println(1/(Math.pow(x,3)+6));

    }
}
