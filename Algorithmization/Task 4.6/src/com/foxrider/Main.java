package com.foxrider;

import java.util.Scanner;
//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(isMutualPrime(a,b,c));
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
     * @param c third natural number
     * @return is mutual prime of not
     */
    static boolean isMutualPrime(int a,int b, int c){
        return gcd(a, b) == 1 && gcd(b,c) ==1 && gcd(c,a)==1;
    }
}
