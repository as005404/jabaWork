package com.foxrider;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Point {
    private double x;
    private double y;

    Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    double line(Point p2){
        return sqrt(pow(p2.x-this.x,2)+pow(p2.y-this.y,2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
