package com.foxrider;

import java.util.Scanner;
//Вычислить значения функции на отрезке [а,b] c шагом h:
public class Main {

    public static void main(String[] args) {
        // Initialization of scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Input range: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Input step: ");
        int h = sc.nextInt();

        for(int x = a; x<=b; x += h){
            if(x > 2){
                System.out.println(x);
            }
            else {
                double y = -x;
                System.out.println(y);
            }
        }
    }
}
