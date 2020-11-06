package com.foxrider;

public class Airlines{
    Airline[] airlines;

    Airlines(Airline ...airlines){
        this.airlines = airlines.clone();
    }

    public void airlinesByDestination(String dest){
        for (var a :
                airlines) {
            if(a.getDestination().equalsIgnoreCase(dest)){
                System.out.println(a);
            }
        }
    }

    public void airlinesByWeekday(Weekend w){
        for (var a :
                airlines) {
            if(a.getDay()==w){
                System.out.println(a);
            }
        }
    }
    public void airlinesByWeekday(Weekend w, String time){
        for (var a :
                airlines) {
            if(a.getDay()==w && a.getDepartTime().compareToIgnoreCase(time)>=0){
                System.out.println(a);
            }
        }
    }

}
