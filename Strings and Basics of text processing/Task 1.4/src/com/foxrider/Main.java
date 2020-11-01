package com.foxrider;
/*
    В строке найти количество чисел.
*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(numberOfNumbers(str));
    }

    static int numberOfNumbers(String s){
        char[] chars = s.toCharArray();
        int counter = 0;
        boolean isContinious = false;
        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i]) && !isContinious){
                counter++;
                isContinious = true;
            }
            if(Character.isLetter(chars[i])||chars[i]==' '){
                isContinious = false;
            }
        }
        return counter;
    }

    static int numberOfNumbersRegex(String s){
        int counter = 0;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);

        while(m.find()){
            counter++;
        }

        return counter;
    }
}
