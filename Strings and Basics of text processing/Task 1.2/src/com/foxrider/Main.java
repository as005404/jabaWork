package com.foxrider;

import java.util.Scanner;
/*
 Замените в строке все вхождения 'word' на 'letter'.
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(replaceWordToLetter(str));
        System.out.println(replaceWordToLetterRegex(str));
    }

    static String replaceWordToLetter(String s){
        int i = 0;
        for (; i < s.length()-3; i++) {
            if(s.substring(i, i + 4).equals("word")){
                s = s.substring(0,i)+"letter"+s.substring(i+4);
                i = 0;
            }
        }

        return s;
    }

    static String replaceWordToLetterRegex(String s){
        return s.replaceAll("word","letter");
    }
}
