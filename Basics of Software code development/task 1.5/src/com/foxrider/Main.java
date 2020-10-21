package com.foxrider;

import javax.print.attribute.standard.JobHoldUntil;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialization of Scanner
        Scanner sc = new Scanner(System.in);

        // input seconds
        System.out.println("Input seconds: ");
        int seconds =  sc.nextInt();
        // Calculation of Hours and Minutes and Seconds
        int hours = seconds / 3600;
        int minutes = seconds / 60 - hours*60;
        seconds = seconds - (hours*3600 + minutes*60);



        System.out.println("Redacted Time: "+AddZeros.addZeros(hours)+"ч"+ AddZeros.addZeros(minutes)+ "мин"+ AddZeros.addZeros(seconds)+"с");
    }

}

class AddZeros{
    //Hours, Minutes, Seconds
    static String addZeros(int time){
        Integer Time = time;

        if(time<10) {
            return "0" + Time.toString();
        }
        else {
            return Time.toString();
        }
    }
}