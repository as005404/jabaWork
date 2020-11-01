package com.foxrider;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    Крайние пробелы в строке удалить.
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(deleteRepeatedSpases(str));
        System.out.println(deleteRepeatedSpasesRegex(str));
    }
    static String deleteRepeatedSpases(String s){
        s = s.trim();
        int i = 0;
        for (; i < s.length(); i++) {
            if(s.charAt(i)==' '&&s.charAt(i+1)==' '){
                s = s.substring(0,i+1)+s.substring(i+2);
                i--;
            }
        }

        return s;
    }

    static String deleteRepeatedSpasesRegex(String s){
        s = s.trim();
        return s.replaceAll("\\s{2,}"," ");
    }
}
