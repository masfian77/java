package com.company;

public class Main {

    public static void main(String[] args) {
	raiseAlarm(5);
	System.out.println();
    }
    private static void raiseAlarm(int numberOfWarnings){

        for (int i  = 1; i <=numberOfWarnings ; i++){
            System.out.println("Warning");
        }
    }
}
