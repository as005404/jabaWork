package com.foxrider;

public class Car {
    private String mark;
    private double fuel;
    private Wheel[] wheels;

    public Car(String mark, double fuel) {
        this.mark = mark;
        this.fuel = fuel;
        wheels = new Wheel[]{
                new Wheel(),
                new Wheel(),
                new Wheel(),
                new Wheel(),
        };
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void showMark() {
        System.out.println(mark);
    }

    public void move(int time) {
        Engine e = new Engine();
        e.enableEngine();
        e.work(time);
    }

    public void fuelUp(double literOfFuel) throws Exception {
        if (literOfFuel < 0) throw new Exception("Gas station cannot take out fuel");
        fuel += literOfFuel;
    }

    public void changeWheel() {
        for (var wheel : wheels) {
            if (wheel.duration <= 4) {
                wheel.duration = 10;
            }
            System.out.printf("wheel duration is %d ", wheel.duration);
        }
    }


    class Engine {
        boolean enableEngine() {
            if (fuel > 0) {
                return true;
            }
            System.out.println("I need fuel, khe, khe");
            return false;
        }

        void work(int sec) {
            do {
                fuel -= 0.1;

                for (var wheel : wheels) {
                    wheel.duration--;
                    System.out.printf("wheel duration is %d", wheel.duration);
                    if (wheel.duration <= 0) {
                        System.out.println("Колесо сломалось ;(");
                        return;
                    }
                }

                System.out.printf("fuel is: %.2f%n", fuel);
                if (fuel <= 0) {
                    System.out.println("Двигатель заглох ;(");
                    return;
                }

                sec--;
            } while (sec > 0);
            return;
        }
    }

    class Wheel {
        int duration;
        Wheel(){
            duration = 10;
        }
    }
}
