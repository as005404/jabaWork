package com.foxrider;


public class Train implements Cloneable{
    private String destination;
    private int route;
    private String departureTime;

    Train(String destination, String departureTime,int route){
        this.destination = destination;
        this.departureTime = departureTime;
        this.route = route;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getRoute() {
        return route;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", route=" + route +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}