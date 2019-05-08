package test;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner sc = new Scanner(System.in);
    private int computerNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    private int round = 0;
    int[] firstPlayerNumber = new int[10];
    int[] secondPlayerNumber = new int[10];

    public GuessNumber(Player playerOne, Player playerTwo, int computerNumber) {
        this.firstPlayer = playerOne;
        this.secondPlayer = playerTwo;
        this.computerNumber = computerNumber;
    }

    public void startGame() {
        System.out.println("------------------------------");
        System.out.println("Start game!!!");
        System.out.println("Each has 10 rounds to guess the number!\n");
        Arrays.fill(firstPlayerNumber, 0);
        Arrays.fill(secondPlayerNumber, 0);
        do {
            System.out.println(firstPlayer.getName() + " it`s you " + round + " round!");
            System.out.print(firstPlayer.getName() + " write you number: ");
            firstPlayer.setNumber(sc.nextInt());
            firstPlayerNumber[round] = firstPlayer.getNumber();
            firstPlayer.setFirstPlayerNumber(firstPlayerNumber);

            if (firstPlayer.getNumber() == computerNumber) {
                System.out.println("\nPlayer " + firstPlayer.getName() + " guess numbers " + computerNumber + " from " + round + " rounds!");
                break;
            } else if (firstPlayer.getNumber() > computerNumber) {
                System.out.println("\nThe number must be less.\n");
            } else if (firstPlayer.getNumber() < computerNumber) {
                System.out.println("\nThe number must be greater.\n");
            } else if (round == 0) {
                System.out.println(firstPlayer.getName() + " you lost, you have" + round + "rounds!");
            }

            System.out.println(secondPlayer.getName() + " it`s you " + round + " round!");
            System.out.print(secondPlayer.getName() + " write you number: ");
            secondPlayer.setNumber(sc.nextInt());
            secondPlayerNumber[round] = secondPlayer.getNumber();
            secondPlayer.setSecondPlayerNumber(secondPlayerNumber);

            if (secondPlayer.getNumber() == computerNumber) {
                System.out.println("\nPlayer " + secondPlayer.getName() + " guess numbers " + computerNumber + " from " + round + " rounds!");
                break;
            } else if (secondPlayer.getNumber() > computerNumber) {
                System.out.println("\nThe number must be less.\n");
            } else if (secondPlayer.getNumber() < computerNumber) {
                System.out.println("\nThe number must be greater.\n");
            } else if (round == 0) {
                System.out.println(secondPlayer.getName() + " you lost, you have" + round + "rounds!");
            }
            round++;

        } while ((firstPlayer.getNumber() != computerNumber || secondPlayer.getNumber() != computerNumber) && round != 10);
    }
}
