package com.foxrider;

/**
    1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
    переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
    наибольшее значение из этих двух переменных.
*/

public class Main {

    public static void main(String[] args) {
        Test t = new Test(1,2);
        t.show();
        System.out.println(t.sum());
        System.out.println(t.max());
    }
}
