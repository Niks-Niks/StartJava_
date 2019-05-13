package test;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner sc = new Scanner(System.in);
    private int computerNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    private int round = 1;
    private boolean win = false;

    public GuessNumber(Player playerOne, Player playerTwo, int computerNumber) {
        this.firstPlayer = playerOne;
        this.secondPlayer = playerTwo;
        this.computerNumber = computerNumber;
    }

    public void startGame() {
        System.out.println("------------------------------");
        System.out.println("Start game!!!");
        System.out.println("Each has 10 rounds to guess the number!\n");
        do {
            bodyGame(firstPlayer);
            bodyGame(secondPlayer);
            round++;
        } while (win != true && round != 11);

        System.out.println("\nGame over!!!");

        printNumbers(firstPlayer);
        printNumbers(secondPlayer);
    }

    public boolean bodyGame(Player player) {
        System.out.println(player.getName() + " it`s you " + round + " round!");
        System.out.print(player.getName() + " write you number: ");
        player.setNumber(sc.nextInt());
        player.setAttemp(player.getNumber(), round);

        if (player.getNumber() == computerNumber) {
            System.out.println("\nPlayer " + player.getName() + " guess numbers " + computerNumber + " from " + round + " rounds!");
            win = true;
        } else if (player.getNumber() > computerNumber) {
            System.out.println("\nThe number must be less.\n");
        } else if (player.getNumber() < computerNumber) {
            System.out.println("\nThe number must be greater.\n");
        } else if (round == 0) {
            System.out.println(player.getName() + " you lost, you have" + round + "rounds!");
        }
        return win;
    }

    public void printNumbers(Player player) {
        System.out.print("\nThese are the numbers that " + player.getName() + " wrote: ");
        for (int numbers : player.getAttemps()) {
            System.out.print(numbers + " ");
        }
    }
}
