package com.foxrider;

import java.util.Scanner;
/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа.
 **/
public class Main {

    public static void main(String[] args) {
        // Initialization of Scanner
        Scanner sc = new Scanner(System.in);
        // input number
        System.out.println("Input real number in nnn.ddd format: ");
        Double x =  sc.nextDouble();

        String str = x.toString();

        int indexOfDot = str.indexOf('.');

        String DecimalPart = str.substring(0,indexOfDot);
        String RealPart = str.substring(indexOfDot+1);

        String FullNumber = RealPart + "." + DecimalPart;

        double ReversedNumber = Double.parseDouble(FullNumber);
        System.out.println("Number with reverced decimal and Real parts : " + ReversedNumber);
    }
}
