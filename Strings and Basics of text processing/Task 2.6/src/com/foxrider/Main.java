package com.foxrider;

import java.util.Scanner;

/*
    Из заданной строки получить новую, повторив каждый символ дважды.

*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(doubleEverySymbol(str));
    }

    private static String doubleEverySymbol(String str) {
        StringBuilder sb = new StringBuilder(str.length()*2);
        for (int i = 0; i < str.length(); i++) {

            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        return sb.toString();
    }
}
