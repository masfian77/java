package com.company;

public class Main {

    public static void main(String[] args) {

    boolean action = true;
    boolean romance = true;
    boolean comedy = true;
    boolean horror = true;

	if (action && romance) {
        // include action and romance
        System.out.println("This movie includes action and romance.");
    }
        if (comedy || horror) {
            // everyone's preferences have been met!
            System.out.println("This also includes comedy or horror.");
    }
    }
}
