package com.foxrider;

import java.util.Scanner;

/*
     Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
     Например, если было введено "abc cde def", то должно быть выведено "abcdef".
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = "              awdqawdjgavdjy w           awvd ajygfgdg    awdfadfdaaaaadddddd";

        System.out.println(deleteDoublesAndSpaces(str));
    }

    private static String deleteDoublesAndSpaces(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        for (; i < sb.length(); i++) {
            if(sb.charAt(i)==' ') {
                sb.delete(i, i + 1);
                i=0;
            }
            for (int j = i+1; j < sb.length(); j++) {
                if(sb.charAt(i)==sb.charAt(j)) {
                    sb.delete(i, i + 1);
                    j--;
                    i = 0;
                }
            }
        }

        return sb.toString();
    }
}
