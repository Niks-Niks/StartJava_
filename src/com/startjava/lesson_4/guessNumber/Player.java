package test;

public class Player {

    private String name;
    private int number;
    private int[] firstPlayerNumber;
    private int[] secondPlayerNumber;

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

    public int[] getFirstPlayerNumber() {
        return firstPlayerNumber;
    }

    public void setFirstPlayerNumber(int[] firstPlayerNumber) {
        this.firstPlayerNumber = firstPlayerNumber;
    }

    public int[] getSecondPlayerNumber() {
        return secondPlayerNumber;
    }

    public void setSecondPlayerNumber(int[] secondPlayerNumber) {
        this.secondPlayerNumber = secondPlayerNumber;
    }
}
