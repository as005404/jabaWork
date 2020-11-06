package com.foxrider;

import java.util.Scanner;

import static java.lang.Math.*;
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side length: ");
        int a = sc.nextInt();

        System.out.println(regHexagonArea(a));


    }

    /**
     *Calculate area of regular triangle
     * @param a Side of the triangle
     * @return Area
     */
    static double regTriangleArea(double a){
        return pow(a,2)*sqrt(3)/4;
    }

    /**
     * Calculate area of regular hexagon
     * @param a Side of the hexagon
     * @return Area
     */
    static double regHexagonArea(double a){
        return regTriangleArea(a)*6;
    }
}
