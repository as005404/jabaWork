package com.foxrider;

import java.util.Arrays;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        int A[][] = new int[10][20];
        int count = 0;
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 20; j++) {
                int tmp = (int)round(random()*15);
                A[i][j] = tmp;
                if(tmp==5)
                    count++;
            }
            if(count>2){
                System.out.println("Row "+i+" contains more or equal to 3 5's");
                System.out.println(Arrays.toString(A[i]));
            }
            count = 0;
        }
        System.out.println(Arrays.deepToString(A));

    }
}
