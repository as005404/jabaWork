package com.foxrider;
//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class Main {

    public static void main(String[] args) {
        System.out.println(sumOfFact());
    }

    static int sumOfFact(){
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            if(i%2==1){
                sum+=fact(i);
            }
        }

        return sum;
    }
    static int fact(int n){
        if(n<2)
            return 1;
        else
            return n* fact(n-1);
    }
}
