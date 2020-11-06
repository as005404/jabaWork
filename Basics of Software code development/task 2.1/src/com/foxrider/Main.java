package com.foxrider;

import java.util.Scanner;
//1. Даны два угла треугольника (в градусах). Определить,
// существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Main {

    public static void main(String[] args) {
        // Initialization of Scanner
        Scanner sc = new Scanner(System.in);

        // Input first and second angles
        System.out.println("Input x and y: ");
        double firstAngle = sc.nextDouble();
        double secAngle = sc.nextDouble();

        //last Angle calculation
        double lastAngle = 180 - firstAngle - secAngle;
        if(lastAngle > 0){
            if(Math.round(firstAngle) == 90 || Math.round(secAngle) == 90 || Math.round(lastAngle) == 90)
                System.out.println("This is right Triangle");
            else
                System.out.println("This is Triangle");
        }
        else
            System.out.println("This is not Triangle");
    }
}
