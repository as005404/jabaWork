package com.foxrider;

import java.util.Arrays;
import java.util.Scanner;
// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int N = sc.nextInt();

        //Initialization of Array
        Integer A[] = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        FreqNumbers freqNumbers = new FreqNumbers(A.length);
        for (int i = 0; i < A.length; i++){
            freqNumbers.add(A[i]);
        }

        Arrays.sort(freqNumbers.getArr());

        System.out.print(freqNumbers.getArr()[0].getNumber());
    }
}



class FreqNumbers{
    class FrequentNumber implements Comparable<FrequentNumber>{
        private int number;
        private int count;

        FrequentNumber(int number){
            this.number = number;
        }

        int getNumber(){
            return number;
        }
        int getCount(){
            return count;
        }

        void setNumber(int number){
            this.number = number;
        }
        void increase(){
            this.count++;
        }

        @Override
        public String toString() {
            return number + " " + count;
        }


        @Override
        public int compareTo(FrequentNumber o) {
           int i = Integer.compare(o.count, this.count);
           if(i==0){
               return Integer.compare(this.number,o.number);
           }else {
               return i;
           }

        }
    }

    private FrequentNumber fn[];
    int last_ind;
    FreqNumbers(int maxLength){
        fn = new FrequentNumber[maxLength];
        for (int i = 0; i < maxLength; i++) {
            fn[i] = new FrequentNumber(0);
        }
    }

    void add(int number){
        int ind = isHere(number);
        if(ind == -1){
            fn[last_ind++].setNumber(number);
            fn[last_ind-1].increase();
        }
        else {
            fn[ind].increase();
        }
    }

    private int isHere(int number){
        if(last_ind==0)return -1;
        for(int i = 0;i<=last_ind;i++){
            if(fn[i].getNumber()==number)
                return i;
        }
        return -1;
    }

    FrequentNumber[] getArr(){
        return fn;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (FrequentNumber a:fn) {
            str.append(a.toString());
        }
        return str.toString();
    }

}