package com.foxrider;

public class Test {
    private int x;
    private int y;

    Test(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int geY(){
        return y;
    }

    public void setX(int x){
        this.x =x;
    }

    public void setY(int y){
        this.y = y;
    }

    int max(){
        return Math.max(x, y);
    }

    int sum(){
        return x+y;
    }

    void show(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Test{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
