package com.foxrider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        System.out.println(numberOfIterations(n));
    }

    /**
     * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
     * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
     * @param num начальное число
     * @return количество итераций
     */
    static int numberOfIterations(int num){
        int counter = 0;
        while (num>0){
            num-=sumOfDigits(arrFromNumber(num));
            counter++;
        }
        return counter;
    }


    static int sumOfDigits(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int[] arrFromNumber(int num){
        String str = Integer.toString(num);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }
}
