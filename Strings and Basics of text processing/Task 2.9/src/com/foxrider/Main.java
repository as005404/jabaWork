package com.foxrider;

import java.util.Scanner;

/*
     Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
     Учитывать только английские буквы.
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(numberOfLowerCase(str));
        System.out.println(numberOfUpperCase(str));
    }


    private static int numberOfLowerCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i)))count++;
        }
        return count;
    }

    private static int numberOfUpperCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))count++;
        }
        return count;
    }

}
