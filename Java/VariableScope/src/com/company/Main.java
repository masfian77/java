package com.company;

public class Main {

    public static void main(String[] args) {
	boolean isLightGreen = false; // true or false
    boolean isLightYellow = true;

        if (isLightGreen) {
            // traffic light is green
            double carSpeed = 100; //in km/hr
            System.out.println("Drive!");
            System.out.println("Speed is " + carSpeed + " km/h");
        }
        else if(isLightYellow) {
            // light is not green but is yellow
            System.out.println("Slow down!");
        }else {
            // light is not green
            System.out.println("Stop!");
        }
    }
}
