package com.foxrider;

public class Time implements ITime{
    private int hour;
    private int minute;
    private int second;

    Time(int hour,int minute,int sec){
        setTime(hour,minute,sec);
    }

    Time(Time o){
        this.hour = o.hour;
        this.minute = o.minute;
        this.second = o.second;
    }

    Time(){
        this(0,0,0);
    }

    @Override
    public String getTime() {
        return toString();
    }

    public int getHours() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSeconds() {
        return this.second;
    }

    @Override
    public Time plusOffset(int hour,int minute,int sec) {
        this.hour +=hour;
        this.minute += minute;
        this.second += sec;

        if(this.second>59){
            this.minute+=(this.second/60);
            this.second %=60;
        }
        if(this.minute>59){
            this.hour+=(this.minute/60);
            this.minute %=60;
        }

        if(this.hour>23){
            this.hour %=24;
        }
        return this;
    }

    @Override
    public Time minusOffset(int hour,int minute,int sec) {
        int currentSecs = toSec(this.hour,this.minute,this.second);
        int offsetSecs = toSec(hour%24,minute,sec);

        setTime(0,0,0);

        if(currentSecs - offsetSecs<0){
            currentSecs += 24*3600;
            plusOffset(0, 0, currentSecs-offsetSecs);
            return this;
        }
        else {
            plusOffset(0, 0, currentSecs - offsetSecs);
            return this;
        }
    }

    private int toSec(int h,int m, int s){
        return h*3600+m*60+s;
    }

    @Override
    public Time setTime(int hour,int minute,int sec) {
        setHour(hour);
        setMinute(minute);
        setSecond(sec);

        return this;
    }

    @Override
    public Time setHour(int hours) {
        this.hour = hours>=0&&hours<24?hours:0;
        return this;
    }

    @Override
    public Time setMinute(int mins) {
        this.minute = mins>=0&&mins<60?mins:0;
        return this;
    }


    @Override
    public Time setSecond(int secs) {
        this.second = secs>=0&&secs<60?secs:0;
        return this;
    }

    @Override
    public String toString() {
        String h = Integer.toString(this.hour);
        String m = Integer.toString(this.minute);
        String s = Integer.toString(this.second);
        if(h.length()==1)h = "0"+h;
        if(m.length()==1)m = "0"+m;
        if(s.length()==1)s = "0"+s;

        return h +":"+ m +":"+ s;
    }
}
