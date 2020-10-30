package com.foxrider;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        System.out.println(sumOfFullyOddNumbers(n));
        System.out.println(numberOfEvenDigits(sumOfFullyOddNumbers(n)));
    }




    static int numberOfEvenDigits(int a){
        int [] arr = arrFromNumber(a);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 ==0) {
                count++;
            }
        }
        return count;
    }

    static int sumOfFullyOddNumbers(int n){
        int b = beginByN(n);
        int e = endByN(n);

        int sum = 0;

        for (int i = b; i <= e; i++) {
            if(isAllOdd(arrFromNumber(i))){
                sum+=i;
            }
        }
        return sum;
    }




    static boolean isAllOdd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0)
                return false;
        }
        return true;
    }



    static int[] arrFromNumber(int num){
        String str = Integer.toString(num);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }

    static int beginByN(int n){
        if(n==1)return 0;
        else {
            String begS = "1";
            for (int i = 0; i < n-1; i++) {
                begS+="0";
            }
            int begin = Integer.parseInt(begS);
            return begin;
        }
    }
    static int endByN(int n){
        String endS = "";
        for (int i = 0; i < n; i++) {
            endS+="9";
        }
        int end = Integer.parseInt(endS);
        return end;
    }
}
