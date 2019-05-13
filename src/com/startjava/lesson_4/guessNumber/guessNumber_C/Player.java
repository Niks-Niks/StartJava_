package test;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] attemps = new int[0];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getAttemps() {
        return attemps;
    }

    public void setAttemps(int attemps) {
        this.attemps = Arrays.copyOf(this.attemps, this.attemps.length + 1); //create new array from old array and allocate one more element
        this.attemps[this.attemps.length - 1] = attemps;
    }
}
