package com.foxrider;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.sqrt;
// Даны дроби
//(Pn/Qn)
//Pi Qi, - натуральные). Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.
public class Main {

    public static void main(String[] args) {
	// Task 3.8
        int[] num = new int[5];
        int[] denom = new int[5];

        SecureRandom r = new SecureRandom();
        for (int i = 0; i < num.length; i++) {
            do {
                num[i] = r.nextInt(50);
            }while (num[i]==0);
        }
        for (int i = 0; i < denom.length; i++) {
            do {
                denom[i] = r.nextInt(10);
            }while (denom[i]==0);

        }

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(denom));

        commonDivisor(num,denom);
        customShellSort(num,denom);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(denom));


    }

    static void commonDivisor(int[] num,int[] denom){
        int comdiv = 1;
        for (int i = 0; i < denom.length; i++) {
            comdiv *=denom[i];
        }
        for (int i = 0; i < num.length; i++) {
            num[i] *= comdiv /denom[i];
            denom[i] = comdiv;
        }

    }

    static void customShellSort(int[] num,int[] denom){
        for (int i = 0; i < num.length-1;) {
            if ( num[i]/denom[i] >   num[i+1]/denom[i+1]) {
                swap(num, i, i + 1);
                swap(denom, i, i + 1);

                if(i!=0) i--;

            } else if(i<num.length-1)
                i++;
        }
    }

    static void swap(int [] arr, int pos1, int pos2){
        var tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }
}
