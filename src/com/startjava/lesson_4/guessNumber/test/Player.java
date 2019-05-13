package test;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] attemp = new int[10];

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
        return attemp;
    }

    public void setAttemp(int attemp, int round) {
        int[] copyAttemp = this.attemp;
        copyAttemp = Arrays.copyOf(copyAttemp, copyAttemp.length - 1);
        copyAttemp[copyAttemp.length - 1] = attemp;
        this.attemp[this.attemp.length - round] = copyAttemp[copyAttemp.length - 1];
    }
}
