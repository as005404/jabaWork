package com.foxrider;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.*;
//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//...,n^2
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
public class Main {

    public static void main(String[] args) {
        generatorMagicSquare(3);
    }


    static void generatorMagicSquare(int order) {
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                int rowMatrix = (((order + 1) / 2 + i + j) % order);
                int colMatrix = (((order + 1) / 2 + i + order - j - 1) % order) + 1;
                System.out.print(((rowMatrix * order) + colMatrix) + "\t");
            }
            System.out.println();
        }
    }
}
