package com.startjava.lesson_1.game;

public class MyFirstGame {	
    public static void main(String[] args) {
        int computerNumber = 50;
        int myNumber = 10;

        System.out.println("Start!!!");

        while(myNumber != computerNumber) {
        	if (myNumber > computerNumber) {
        		System.out.println("You write " + myNumber + " , computer number less");
        		myNumber--;
        	} else if (myNumber < computerNumber) {
        		System.out.println("You write " + myNumber + " , computer number more");
        		myNumber++;
        	}
        }
        System.out.println("You win!!!");
    }
}