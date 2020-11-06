package com.foxrider;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
//Даны две неубывающие последовательности
//Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
public class Main {

    public static void main(String[] args) {
	// Task 3.2
        int[] dest = new int[150];
        int[] src = new int[50];

        Random r = new Random(3129);
        for (int i = 0; i < src.length; i++) {
            dest[i] = r.nextInt(50);
        }
        for (int i = 0; i < src.length; i++) {
            src[i] = r.nextInt(50);
        }

        Arrays.sort(dest,0,51);
        System.out.println(Arrays.toString(dest));
        Arrays.sort(src);
        System.out.println(Arrays.toString(src));

        merge(dest,src,50);

        System.out.println(Arrays.toString(dest));




    }
    public static void merge(int dest[],int src[], int LengthOfSignElOfDest){
        if(dest.length<src.length) {
            throw new ArrayIndexOutOfBoundsException("Destination array should be greater than source array");
        }
        // индекс последнего эл. dest, который отведен под хранение двух массивов, который постоянно изменяется,
        // так как я не думаю, что здесь можно использовать коллекции, в которых есть .size()
        int indLast = LengthOfSignElOfDest;
        e:
        /*
            Мы берем каждый элемент из массива src и ждем элемента, который больше него,
            если находим - вставляем на его место, и все сдвигается вправо,
            Если нет(j > indLast) - то ставим его на последнее место+1(indLast+1 или j, которое как раз равно indLast+1)
            Если indLast уже вышел за пределы суммы длин двух массивов - выход
        * */
        for (int i = 0; i < src.length; i++) {
            int j = 0;
            while (src[i]>=dest[j]){
                if(indLast>=LengthOfSignElOfDest+src.length)return;
                j++;
                if(j> indLast){
                    insertElem(dest,src[i],j);
                    indLast++;
                    j = 0;
                    continue e;
                }
            }
            insertElem(dest,src[i],j);
            indLast++;
            j = 0;
            continue e;

        }
        // была еще идея слить два массива и использовать Arrays.sort(dest,0,100); ))0)
        //
    }



    static void insertElem(int[]destArr,int Elem,int index){
        for (int i = destArr.length-2; i >= index; i--) {
            destArr[i+1] = destArr[i];
        }
        destArr[index] = Elem;
    }
}
