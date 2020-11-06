package com.foxrider;

import java.util.Scanner;
// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Main {

    public static void main(String[] args) {

        //char range is 0 .. 65535
        for(int i = 0; i<= 65535; i++)
            System.out.println("Code:"+i+" Symbol: "+ (char)i);
    }

}
