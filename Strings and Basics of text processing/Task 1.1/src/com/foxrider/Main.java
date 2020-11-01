package com.foxrider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/*
    Дан массив названий переменных в camelCase.
    Преобразовать названия в snake_case.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string in camelCase: ");
        String str = sc.nextLine();
        System.out.println(toSnakeCase(str));

        System.out.println(toSnakeCaseRegex(str));

    }
    static String toSnakeCase(String s){
        int begInd = 0;
        int endInd = 0;
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                if(begInd==0){
                    endInd = i;
                    s2 += s.substring(begInd,endInd);
                    begInd = i;
                }else {
                    endInd = i;
                    s2 += "_"+ s.substring(begInd,endInd);
                    begInd = i;
                }
            }

        }
        s2+="_"+ s.substring(begInd,s.length());
        return s2.toLowerCase();
    }

    static String toSnakeCaseRegex(String s){
        Pattern p = Pattern.compile("[a-z]+|[A-Z][a-z]*");
        Matcher m = p.matcher(s);
        int counter = 0;
        ArrayList<String> strings= new ArrayList<>();

        while (m.find()){
            strings.add(m.group());
        }

        return String.join("_",strings).toLowerCase();
    }
}
