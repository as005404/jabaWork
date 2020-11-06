package com.foxrider;

import java.util.Arrays;
import java.util.Comparator;

public class Trains {
    Train [] trains;
    Trains(Train[]tr){
        trains = new Train[tr.length];
        System.arraycopy(tr,0,trains,0,tr.length);
    }
    public void sortByNumbers(){
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return Integer.compare(o1.getRoute(),o2.getRoute());
            }
        });
    }

    public void showTrains(){
        for (Train train : trains) {
            System.out.println(train);
        }
    }

    public void showTrains(int number) throws IllegalArgumentException{
        int count = 0;
        for (Train tr:trains) {
            if(tr.getRoute()==number){
                count++;
                System.out.println(tr);
            }
        }
        if(count==0) {
            throw new IllegalArgumentException("No such Train");
        }
    }

    public void sortByDestination(){
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if(o1.getDestination().compareToIgnoreCase(o2.getDestination())>0){
                    return 1;
                }
                else if(o1.getDestination().compareToIgnoreCase(o2.getDestination())<0)
                    return -1;
                else{
                    return Integer.compare(o1.getDepartureTime().compareToIgnoreCase(o2.getDepartureTime()), 0);
                }
            }
        });
    }
}

