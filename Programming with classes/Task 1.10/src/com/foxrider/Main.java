package com.foxrider;

import java.time.DayOfWeek;

public class Main {
/**
 *  Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 **/
    public static void main(String[] args) {
        Weekend s = Weekend.FRIDAY;

        Airline a1 = new Airline("Минск", 789,"Эконом","09:00",Weekend.MONDAY);
        Airline a2 = new Airline("Брест", 7419,"Премиум","13:00",Weekend.THURSDAY);
        Airline a3 = new Airline("Барановичи", 7289,"Эконом","07:00",Weekend.THURSDAY);
        Airline a4 = new Airline("Минск", 7689,"Премиум","11:30",Weekend.TUESDAY);
        Airline a5 = new Airline("Пинск", 7819,"Эконом","08:30",Weekend.WEDNESDAY);
        Airline a6 = new Airline("Минск", 7989,"Эконом","09:00",Weekend.MONDAY);

        Airlines airlines = new Airlines(a1,a2,a3,a4,a5,a6);

        airlines.airlinesByDestination("минск");

        System.out.println("\n\n");
        airlines.airlinesByWeekday(Weekend.MONDAY);

        System.out.println("\n\n");
        airlines.airlinesByWeekday(Weekend.THURSDAY,"10:00");

    }
}
