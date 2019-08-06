package com.company;

public class Main {

    public static void main(String[] args) {
        printPhoto(20, 10, false);
    }
    private static void printPhoto(int width, int height, boolean inColor) {
        System.out.println("Width = " + width + " cm");
        System.out.println("Height = " + height + " cm");
        if (inColor) {
            System.out.println("Print is full color.");
        } else {
            System.out.println("Print is black and white.");
        }
    }
}
