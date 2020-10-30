package com.foxrider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(compareLength(a,b));
    }

    /**
     * Function that compare length of two numbers
     * @param a natural number
     * @param b natural number
     * @return number that greater or -1 if length is equal
     */
    static int compareLength(int a,int b){
        int lenA = Integer.toString(a).length();
        int lenB = Integer.toString(b).length();
        if(lenA>lenB)
            return a;
        else if(lenB>lenA)
            return b;
        else return -1;
    }
}
