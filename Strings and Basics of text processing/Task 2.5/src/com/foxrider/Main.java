package com.foxrider;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(numberOfA(str));
        System.out.println(numberOfARegex(str));
    }

    static int numberOfA(String s){
        int count = 0;
        String tmp = s;
        while(tmp.indexOf('a')!=-1){
            count++;
            if(tmp.indexOf('a')==tmp.length()-1){
                break;
            }
            tmp = tmp.substring(tmp.indexOf('a')+1);
        }
        return count;
    }
    static int numberOfARegex(String s){
        int count = 0;
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher(s);

        while(m.find())count++;

        return count;
    }
}
