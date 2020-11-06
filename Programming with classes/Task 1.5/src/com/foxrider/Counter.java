package com.foxrider;

public class Counter {
    private final int begValue;
    private final int endValue;
    private int currentValue;

    Counter(int begValue, int endValue, int currentValue){
        if(begValue>endValue)throw new IllegalArgumentException("begValue cannot be greater than endValue");
        if(currentValue<begValue||currentValue>endValue) throw new IllegalArgumentException("currentValue should be in range");

        this.begValue = begValue;
        this.endValue = endValue;
        this.currentValue = currentValue;
    }

    Counter(int endValue){
        this(0,endValue,0);
    }

    Counter(){
        this(10);
    }

    int add(){
        if(currentValue+1>endValue-1) currentValue = begValue;
        else currentValue++;

        return currentValue;
    }

    int substract(){
        if(currentValue-1<begValue)
            currentValue = endValue;
        else
            currentValue--;

        return currentValue;
    }

    int getCurrentValue(){
        return this.currentValue;
    }
    int getBegValue(){
        return this.begValue;
    }
    int getEndValue(){
        return this.endValue;
    }

}
