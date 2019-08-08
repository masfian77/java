package com.company;

public class Main {

    public static void main(String[] args) {
    evenNumber(2);
    }

    private static void evenNumber(int i) {
        for (i = 2; i <= 10; i+=2)
            System.out.println(i);
    }
}
