package com.foxrider;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter k and n: ");
        int k = sc.nextInt();
        int n = sc.nextInt();

        //System.out.println(Arrays.toString(arrFromNumber(a)));


        System.out.println(Arrays.toString(arrFromNumber(k,n)));


        arrFromNumber(6,100);

    }

    /**
     * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
     * являются числа, сумма цифр которых равна К и которые не большее N
     * @param k natural number
     * @param n natural number that shouldn't be overcame
     * @return array of numbers which sum of number is equal to K
     */
    static int[] arrFromNumber(int k,int n){
        int j = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if(sumOfDigits(i)==k){
                arr[j++] = i;
            }
        }
        return Arrays.copyOf(arr,j);

    }

    static int sumOfDigits(int a){
        String astr = Integer.toString(a);
        int sum = 0;
        for (int i = 0; i < astr.length(); i++) {
            sum += charToInt(astr.charAt(i));
        }
        return sum;
    }

    static int charToInt(char a){
        return a-'0';
    }

}
