package com.company;

public class Main {

    public static void main(String[] args) {
        raiseAlarm(5);
        System.out.println();
    }
    private static void raiseAlarm(int numberOfWarnings){

        for (int i  = 1; i <= 3 ; i++) {
            int x = i - 1;
            System.out.println(x);
        }
        for (int i = 1; i <= 3 ; i++){
            System.out.println(i*2);
        }
    }
}
