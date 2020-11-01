package com.foxrider;

import java.util.Scanner;

/*
    Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
    знаком. Определить количество предложений в строке X
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String X = sc.nextLine();

        System.out.println(numberOfSentences(X));

    }


    private static int numberOfSentences(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if(tmp =='.' || tmp =='!' || tmp =='?')count++;// [\\.\\?!] изи заменяется
        }
        return count;
    }
}
