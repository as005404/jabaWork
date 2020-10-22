package com.foxrider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Initialization of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        String strA = Integer.toString(a);
        String strB = Integer.toString(b);

        int tenFirstDigits[] = new int[10];

        for(int i = 0;i<strA.length();i++){
            for(int j = 0;j<strB.length();j++){
                if(strA.charAt(i)==strB.charAt(j))
                    if(tenFirstDigits[(int)(strA.charAt(i)-'0')]==0){
                        System.out.println(strA.charAt(i));
                        tenFirstDigits[(int)(strA.charAt(i)-'0')]++;
                    }
            }
        }

    }
}
