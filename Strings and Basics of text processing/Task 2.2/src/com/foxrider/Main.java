package com.foxrider;

import java.util.Scanner;

/*
    В строке вставить после каждого символа 'a' символ 'b'.
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(addBtoA(str));
    }

    static String addBtoA(String s){
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='a'){
                sb.insert(i+1,'b');
            }
        }

        return sb.toString();
    }
}
