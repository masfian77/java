package com.company;

public class Main {

    public static void main(String[] args) {

	likePhoto(0,"Nice color!", false);
	likePhoto(0,"I like this", true);
	int returnedLikes = likePhoto(0, "Nice color!", false);
    int totalLikes = likePhoto(returnedLikes, "I like this", true);
    }

    private static int likePhoto(int currentLikes, String comment, boolean like) {

        // print out comment
        System.out.println("Feedback: " + comment);
        if (like) {
            // increase number of likes by 1
            currentLikes = currentLikes + 1;
        }
        // print out curren number of likes
        System.out.println("Number of likes: " + currentLikes);
        // return  current likes
        return currentLikes;

    }
}
