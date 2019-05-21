package com.startjava.lesson_2_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = null;
        do {
            System.out.print("Player one - write you name: ");
            Player playerOne = new Player(sc.nextLine());
            
            System.out.print("Player two - write you name: ");
            Player playerTwo = new Player(sc.nextLine());            
            
            GuessNumber guessNum = new GuessNumber(playerOne, playerTwo, (int) (Math.random() * 101));
            guessNum.startGame();
            do {
                System.out.println("\nDo you want to continue? [Yes/No]");
                answer = sc.nextLine();
                if (!answer.equals("Yes") && !answer.equals("No")) {
                    System.out.println("Should be only Yes or No!");
                }
            } while (!answer.equals("Yes") && !answer.equals("No"));
        } while (answer.equals("Yes"));
    }
}
