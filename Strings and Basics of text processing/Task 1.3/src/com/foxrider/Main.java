package com.foxrider;
/*
    В строке найти количество цифр.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(numberOfDigits(str));
    }


    static int numberOfDigits(String s){
        char[] chars = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i])){
                counter++;
            }
        }
        return counter;
    }
}
