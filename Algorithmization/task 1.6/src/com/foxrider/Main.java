package com.foxrider;

import java.util.Scanner;
//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int N = sc.nextInt();

        //Initialization of Array
        double A[] = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextDouble();
        }

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
                sum+=A[i];
            }
        }

        System.out.println("sum: "+ sum);
    }

    static boolean isPrime(int n){
        int sqrt = (int)Math.ceil(Math.sqrt(n));
        if(n==2||n==3)
            return true;

        for (int i = 2; i <=sqrt; i++) {
            if(n % i== 0){
                return false;
            }
        }
        return true;
    }
}
