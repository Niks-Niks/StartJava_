package test;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner sc = new Scanner(System.in);
    private int computerNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    private int round = 1;
    boolean checkFirstPlayerWin;
    boolean checkSecondPlayerWin;

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

            recordedInformation(firstPlayer);
            recordedInformation(secondPlayer);

            checkFirstPlayerWin = checkValues(firstPlayer);
            checkSecondPlayerWin = checkValues(secondPlayer);

            round++;
        } while ((checkFirstPlayerWin != true && checkSecondPlayerWin != true) && round != 11);

        System.out.println("\nGame over!!!");

        printNumbers(firstPlayer);
        printNumbers(secondPlayer);
    }

    public void recordedInformation(Player player) {
        System.out.print(player.getName() + " write you number: ");
        player.setNumber(sc.nextInt());
        player.setAttemp(player.getNumber(), round);
    }

    public Boolean checkValues(Player player) {
        if (player.getNumber() == computerNumber) {
            System.out.println("\nPlayer " + player.getName() + " guess numbers " + computerNumber + " from " + round + " rounds!");
        } else if (player.getNumber() > computerNumber) {
            System.out.println("\n" + player.getName() + " you number must be less.");
        } else if (player.getNumber() < computerNumber) {
            System.out.println("\n" + player.getName() + " you number must be greater.");
        }

        return player.getNumber() == computerNumber;
    }

    public void printNumbers(Player player) {
        System.out.print("\nThese are the numbers that " + player.getName() + " wrote: ");
        for (int numbers : player.getAttemps()) {
            System.out.print(numbers + " ");
        }
    }
}
