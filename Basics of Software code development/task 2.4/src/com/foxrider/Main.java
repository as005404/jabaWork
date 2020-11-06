package com.foxrider;

import java.util.Scanner;
// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.
public class Main {

    public static void main(String[] args) {
        // Initialization of Scanner
        Scanner sc = new Scanner(System.in);

        // Input x,y,z of Brick
        System.out.println("Input x and y and z of Brick ");
        double BrickX = sc.nextDouble();
        double BrickY = sc.nextDouble();
        double BrickZ = sc.nextDouble();

        System.out.println("Input y and z of Hole ");
        double HoleX = sc.nextDouble();
        double HoleY = sc.nextDouble();

        if (BrickX <= HoleX && BrickY <= HoleY || BrickY <= HoleX && BrickZ <= HoleY || BrickZ <= HoleX && BrickX <= HoleY || BrickX <= HoleY && BrickY <= HoleX){
            System.out.println(true);
        }
        else
            System.out.println(false);
    }
}
