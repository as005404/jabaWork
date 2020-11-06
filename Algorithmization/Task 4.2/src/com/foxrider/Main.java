package com.foxrider;

import java.util.Scanner;
//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(gcd(a,b,c,d));

    }


    /**
     * @param a first natural number
     * @param b second natural number
     * @param c second natural number
     * @param d second natural number
     * @return gcd of four numbers
     */
    static int gcd(int a,int b, int c, int d){
        return gcd(gcd(a,b),gcd(c,d));
    }


    static int gcd(int a,int b){
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
}
