package com.foxrider;

public interface ITime {

    String getTime();

    Time plusOffset(int hour,int minute,int sec);

    Time minusOffset(int hour,int minute,int sec);

    Time setTime(int hour,int minute,int sec);

    Time setMinute(int mins);
    Time setHour(int hours);
    Time setSecond(int secs);


}
