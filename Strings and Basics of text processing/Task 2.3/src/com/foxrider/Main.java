package com.foxrider;
// Проверить, является ли заданное слово палиндромом.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(isPalindrom(str));
    }

    static boolean isPalindrom(String s){
        StringBuilder sb= new StringBuilder(s);
        return sb.toString().equalsIgnoreCase(sb.reverse().toString());

    }
}
