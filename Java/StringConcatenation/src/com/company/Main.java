package com.company;

public class Main {

    public static void main(String[] args) {
	String driverFirstName;
	driverFirstName = "Hamish";
	String driverLastName;
	driverLastName = "Blake";
	String driverFullName = driverFirstName + " " + driverLastName;
	System.out.println(driverFullName);

	int stops;
	int fare;
	stops = 0;
	fare = 0;
	stops = stops + 1;
	fare = fare +5;
	stops = stops + 1;
	fare = fare + 3;
	stops = stops + 1;
	fare = fare + 7;
    System.out.println("The bus made $"+fare+" after "+stops+" stops");
    }
}
