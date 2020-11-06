package com.foxrider;

import java.util.Scanner;

import static java.lang.Math.sqrt;
//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(areaOfQuadrangle(a,b,c,d));

    }

    static double semiPerimeter(double a, double b, double c,double d){
        return (a+b+c+d)/2;
    }

    static double areaOfQuadrangle(double a, double b, double c,double d){
        double p = semiPerimeter(a,b,c,d);

        return sqrt((p-a)*(p-b)*(p-c)*(p-d));
    }
}
