package com.foxrider;

/**
    Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
     из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
    номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Main {

    public static void main(String[] args) {
        Student[] s = {
                new Student("Антон", "AC-54И",new byte[]{8,7,8,5,9}),
                new Student("Дима", "AC-54И",new byte[]{8,8,8,9,9}),
                new Student("Илья", "AC-54И",new byte[]{10,9,9,9,9}),
                new Student("Катя", "AC-54И",new byte[]{7,7,8,6,9}),
                new Student("Гена", "AC-54И",new byte[]{5,5,4,7,10}),
                new Student("Антон", "AC-54И",new byte[]{9,10,9,9,9}),

        };
        StudentByMarks marks = new StudentByMarks(s);
        marks.getCleverStudents(8);
    }
}
