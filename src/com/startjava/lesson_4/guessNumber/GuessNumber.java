package com.startjava.lesson_2_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner sc = new Scanner(System.in);
    private int computerNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    private int round = 1;
    boolean isWin;

    public GuessNumber(Player playerOne, Player playerTwo, int computerNumber) {
        this.firstPlayer = playerOne;
        this.secondPlayer = playerTwo;
        this.computerNumber = computerNumber;
    }

    public void startGame() {
        System.out.println("------------------------------");
        System.out.println("Start game!!!");
        System.out.println("Each has 10 rounds to guess the number!\n");
        System.out.println(computerNumber);
        do {
            System.out.println("\nRound " + round + "\n");
            if (round == 10) {
                System.out.println("This is the last round!\n");
            }

            inputNumber(firstPlayer);
            isWin = checkNumber(firstPlayer);
            
            if (isWin != true) {
                inputNumber(secondPlayer);
                isWin = checkNumber(secondPlayer);
            }

            round++;
        } while (isWin != true && round != 11);

        System.out.println("\nGame over!!!");

        printNumbers(firstPlayer);
        printNumbers(secondPlayer);
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " write you number: ");
        player.setNumber(sc.nextInt(), round);
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() > computerNumber) {
            System.out.println(player.getName() + " you number must be less.\n");
        } else if (player.getNumber() < computerNumber) {
            System.out.println(player.getName() + " you number must be greater.\n");
        } else { 
            System.out.println("\nPlayer " + player.getName() + " guess numbers " + computerNumber + " from " + round + " rounds!");
            return true;
        }
        return false;
    }

    private void printNumbers(Player player) {
        System.out.print("\nThese are the numbers that " + player.getName() + " wrote: ");
        for (int numbers : player.getAttemps(round)) {
            System.out.print(numbers + " ");
        }
    }
}