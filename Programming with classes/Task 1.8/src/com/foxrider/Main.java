package com.foxrider;
/**
 *  Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 *  a) список покупателей в алфавитном порядке;
 *  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 * */
public class Main {

    public static void main(String[] args){
        Customer c,c1,c2,c3;
        c1 = c2 =c3 =c = null;
        try {
            c = new Customer("Исаченко", "Антон", "Геннадьевич", "мой", 1337_1337_1337_1337L, "SADD232AAD21DFR3");
            c1 = new Customer("Балаболов", "Антон", "Геннадьевич", "мой", 3228_3228_3228_3228L, "SADD232AAD21DFR3");
            c2 = new Customer("Пиздаболов", "Антон", "Геннадьевич", "мой", 1337_3455_1337_1337L, "SADD232AAD21DFR3");
            c3 = new Customer("Вешалка", "Антон", "Геннадьевич", "мой", 7788_1337_1337_1337L, "SADD232AAD21DFR3");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        Customers cs = new Customers(c,c1,c2,c3);
        cs.printSortedByLastName();
        System.out.println("\n\n");
        try{
            cs.printInRangeCreditCard(1000_0000_0000_0000L,4000_0000_0000_0000L);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
