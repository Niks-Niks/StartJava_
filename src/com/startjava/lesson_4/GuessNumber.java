package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {

    Scanner sc = new Scanner(System.in);
    private int computerNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo, int computerNumber) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.computerNumber = computerNumber;
    }

    public void startGame() {
        System.out.println("------------------------------");
        System.out.println("Start game!!!");
        do {

            System.out.print(playerOne.getName() + " write you number: ");
            playerOne.setNumber(sc.nextInt());

            if (playerOne.getNumber() == computerNumber) {
                System.out.println("Congratulations, " + playerOne.getName() + " win!!!");
                break;
            } else if (playerOne.getNumber() > computerNumber) {
                System.out.println("The number must be less.");
            } else if (playerOne.getNumber() < computerNumber) {
                System.out.println("The number must be greater.");
            }

            System.out.print(playerTwo.getName() + " write you number: ");
            playerTwo.setNumber(sc.nextInt());

            if (playerTwo.getNumber() == computerNumber) {
                System.out.println("Congratulations, " + playerTwo.getName() + " win!!!");
                break;
            } else if (playerTwo.getNumber() > computerNumber) {
                System.out.println("The number must be less.");
            } else if (playerTwo.getNumber() < computerNumber) {
                System.out.println("The number must be greater.");
            }
        } while (playerOne.getNumber() != computerNumber || playerTwo.getNumber() != computerNumber);
    }
}
