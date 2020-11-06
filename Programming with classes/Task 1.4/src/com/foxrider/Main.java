package com.foxrider;

/**
    Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.+
    Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
    номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
    Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
    назначения должны быть упорядочены по времени отправления.
 */

public class Main {

    public static void main(String[] args) {
        Train [] tr = new Train[]{
                new Train("Брест","09:00",21),
                new Train("Минск","09:30",45),
                new Train("Минск","07:00",16),
                new Train("Могилев","13:00",17),
                new Train("Гродно","15:00",18),
        };

        Trains trains = new Trains(tr);

        trains.showTrains();
        trains.sortByNumbers();
        System.out.println("\n\n");
        trains.showTrains();

        trains.sortByDestination();
        System.out.println("\n\n");
        trains.showTrains();

        trains.showTrains(13);

    }
}
