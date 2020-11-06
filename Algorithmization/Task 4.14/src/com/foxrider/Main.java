package com.foxrider;

import java.util.Scanner;

import static java.lang.Math.pow;
//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter k: ");
        int k = sc.nextInt();


        ArmstrongNumbers(k);
    }

    static void ArmstrongNumbers(int k){

        for(int i = 1;i<=k;i++){
            String iStr = Integer.toString(i);
            int sum = 0;
            for (int j = 0; j < iStr.length(); j++) {
                int tmp = (int)pow(charToInt(iStr.charAt(j)),iStr.length());
                sum+=tmp;
            }
            if(i==sum){
                System.out.println("Armstrong number is "+i);
            }
        }
    }

    static int charToInt(char a){
        return a-'0';
    }
}
