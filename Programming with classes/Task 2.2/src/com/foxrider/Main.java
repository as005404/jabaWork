package com.foxrider;
/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля
 * */
public class Main {

    public static void main(String[] args) throws Exception {
        Car c = new Car("BNW", 5);
        c.move(50);
        c.changeWheel();
        c.move(50);
        c.changeWheel();
        c.move(50);
        c.changeWheel();
        c.move(50);
        c.changeWheel();
        c.move(50);

        c.changeWheel();
        c.move(50);
        c.fuelUp(5);
        c.move(50);
    }
}
