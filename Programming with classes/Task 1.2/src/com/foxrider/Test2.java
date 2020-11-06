package com.foxrider;

public class Test2 {
    private int x;
    private int y;

    Test2(int x,int y){
        this.x = x;
        this.y = y;
    }

    Test2(){
        this(0,0);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
}
