package com.foxrider;

import java.util.Scanner;

/*
     Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
     Случай, когда самых длинных слов может быть несколько, не обрабатывать.
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(MostLongWord(str));
    }


    private static String MostLongWord(String str) {
        int max = -1;
        int index = -1;
        String[] strs  =str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length()>max){
                max = strs[i].length();
                index = i;
            }
        }
        return strs[index];
    }


}
