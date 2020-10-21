package com.foxrider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialization of Scanner
        Scanner sc = new Scanner(System.in);

        // Input first and second angles
        System.out.println("Input x and y of A(x,y), B(x,y), C(x,y): ");

        double Ax = sc.nextDouble();
        double Ay = sc.nextDouble();

        double Bx = sc.nextDouble();
        double By = sc.nextDouble();

        double Cx = sc.nextDouble();
        double Cy = sc.nextDouble();

        if ((Ay-By)*Cx + (Bx-Ax) * Cy + (Ax*By - Bx*Ay)==0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
