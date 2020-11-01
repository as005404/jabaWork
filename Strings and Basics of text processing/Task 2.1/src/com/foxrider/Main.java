package com.foxrider;

import java.util.Scanner;

/*
    Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(maxCountOfSpaces(str));
    }


    static int maxCountOfSpaces(String s){
        char[] chars = s.toCharArray();
        int max = 0;
        boolean isContinious = false;
        int currentCount = 0;

        for (int i = 0; i < chars.length; i++) {

            if(chars[i]==' '){
                currentCount++;
                isContinious = true;
            }
            if(Character.isLetterOrDigit(chars[i]) && isContinious|| i == chars.length-1 && isContinious){
                max = Math.max(max, currentCount);
                isContinious = false;
                currentCount = 0;
            }
        }
        return max;
    }
}
