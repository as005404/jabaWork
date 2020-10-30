package com.foxrider;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of points: ");
        int n = sc.nextInt();

        int x[] = new int[n];
        int y[] = new int[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

        pointsWithMaxLength(x,y);

    }
    static double lengthBnTwoPoints(int x1,int y1,int x2,int y2){
        return sqrt(pow(x1-x2,2)+ pow(y1-y2,2));
    }

    /**
     * Method is printing maximum length and points assosiated with it
     * @param x array of x coordinates
     * @param y array of x coordinates
     */
    static void pointsWithMaxLength(int [] x,int[] y){
        double max = Double.MIN_VALUE;
        int a1 = 0,a2 = 0,b1 = 0,b2 = 0;


        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                double length = lengthBnTwoPoints(x[i],y[i],x[j],y[j]);
                if(length>max){
                    max = length;

                    a1 = x[i];
                    a2 = y[i];

                    b1 = x[j];
                    b2 = y[j];
                }
            }
        }

        System.out.println("Points are "+ a1+" "+a2+" and "+b1+" "+b2+". Max length is "+ max);
     }

}
