package com.startjava.lesson_2_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] attemps = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number, int round) {
        this.number = number;
        attemps[attemps.length - round] = number;
    }

    public int[] getAttemps(int round) {
        int[] copyAttemp = Arrays.copyOf(attemps, round - 1);
        for (int i = attemps.length - copyAttemp.length, j = 0; i < attemps.length; i++, j++) {
            copyAttemp[j] = attemps[i];
        }
        return copyAttemp;
    }
}
