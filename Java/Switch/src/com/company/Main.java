package com.company;

public class Main {

    public static void main(String[] args) {
        int passcode = 312;
        String coffeeType;
        if (passcode == 555) {
            // espresso passcode
            coffeeType = "Espresso";
        } else if (passcode == 312) {
            // vanilla latte passcode
            coffeeType = "Vanilla Latte";
        } else  if (passcode == 629) {
            // drip coffee code
            coffeeType = "Drip coffee";
        }else {
            // unknown passcode
            coffeeType = "Unknown";
        }
        System.out.println(coffeeType);
    }
}