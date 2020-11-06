package com.foxrider;

import java.util.Arrays;
import static java.lang.Math.*;
// Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.
public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[30];
        for (int i = 0; i < 15; i++) {
            arr1[i] = (int)(random()*100);
        }
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 99;
        }

        System.out.println(Arrays.toString(arr1));
        insertArr(arr1,arr2,10,15);


        System.out.println(Arrays.toString(arr1));
    }

    static void insertArr(int[]destArr,int[]srcArr,int k,int lenOfSignElemsInSrc){
        if(destArr.length-lenOfSignElemsInSrc<srcArr.length){
            throw new ArrayIndexOutOfBoundsException("Elements of source array are out of bound");
        }else if(k+srcArr.length>=destArr.length)
            throw new ArrayIndexOutOfBoundsException("Elements of source array are out of bound");

        for (int i = k, j = 0; j < srcArr.length; i++,j++) {

            destArr[i+srcArr.length] = destArr[i];
            destArr[i] = srcArr[j];

        }
        System.out.println(Arrays.toString(srcArr));

    }
}
