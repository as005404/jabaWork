package com.foxrider;

public class Triangle extends Figure{
    protected Point c;
    Triangle(Point a, Point b, Point c){
        super(a,b);
        this.c = c;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
}
