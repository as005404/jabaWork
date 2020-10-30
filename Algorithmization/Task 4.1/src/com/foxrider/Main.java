package com.foxrider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));

    }


    /**
     * @param a first natural number
     * @param b second natural number
     * @return gcd of a and b numbers
     */
    static int gcd(int a,int b){
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
    /**
     * @param a first natural number
     * @param b second natural number
     * @return lcm of a and b numbers
     */
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
