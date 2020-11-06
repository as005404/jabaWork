package com.foxrider;

import java.util.Scanner;
// Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:
public class Main {

    public static void main(String[] args) {
        // Initialization of Scanner
        Scanner sc = new Scanner(System.in);

        // Input x and y
        System.out.println("Input x and y: ");
        double x = sc.nextInt();
        double y = sc.nextInt();

        //
        if( x == 0 && y == -1)
            System.out.println(false);
        else if(y > 0) {
            if (x >= -2 && x <= 2 && y <= 4)
                System.out.println(true);
            else
                System.out.println(false);
        }
        else{
                if (x >= -4 && x <= 4 && y >= -4)
                    System.out.println(true);
                else
                    System.out.println(false);
            }
    }
}
