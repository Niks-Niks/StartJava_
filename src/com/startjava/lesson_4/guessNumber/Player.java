package test;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] savePlayerNumber = new int[10];

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

    public int[] getSavePlayerNumber() {
        Arrays.copyOf(savePlayerNumber, savePlayerNumber.length);
        for (int i = 0; i < savePlayerNumber.length; i++) {
            System.out.print(savePlayerNumber[i] + " ");
        }
        return null;
    }

    public void setSavePlayerNumber(int playerNumber, int i) {
        while(i < savePlayerNumber.length) {
            savePlayerNumber[i] = playerNumber;
            break;
        }
    }
}
