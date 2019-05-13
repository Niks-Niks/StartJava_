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
            help(firstPlayer);
            help(secondPlayer);
            round++;
        } while (win != true && round != 11);

        System.out.println("\nGame over!!!\n");

        System.out.print("These are the numbers that " + firstPlayer.getName() + " wrote: ");
        for (int numbers : firstPlayer.getAttemps()) {
            System.out.print(numbers + " ");
        }
        System.out.println("");
        System.out.print("These are the numbers that " + secondPlayer.getName() + " wrote: ");
        for (int numbers : secondPlayer.getAttemps()) {
            System.out.print(numbers + " ");
        }
    }

    public boolean help(Player player) {
        System.out.println(player.getName() + " it`s you " + round + " round!");
        System.out.print(player.getName() + " write you number: ");
        player.setNumber(sc.nextInt());
        player.setAttemps(player.getNumber());

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
}
