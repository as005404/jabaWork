package com.foxrider;

public class Airline {
    private String destination;
    private int number;
    private String airplaneType;
    private String departTime;
    private Weekend day;


    public Airline(String destination, int number, String airplaneType, String departTime, Weekend day) {
        this.destination = destination;
        this.number = number;
        this.airplaneType = airplaneType;
        this.departTime = departTime;
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public Weekend getDay() {
        return day;
    }

    public void setDay(Weekend day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", airplaneType='" + airplaneType + '\'' +
                ", departTime='" + departTime + '\'' +
                ", day=" + day +
                '}';
    }
}
