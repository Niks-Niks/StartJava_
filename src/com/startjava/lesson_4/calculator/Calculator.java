package com.startjava.lesson_2_4.calculator;

public class Calculator {

    private int firstNumber;
    private char operation;
    private int secondNumber;
    private int[] numbers = new int[2];
    private String[] saveTask;

    public Calculator(String[] saveTask) {
        this.saveTask = saveTask;
    }

    public int calculate() {
        firstNumber = numbers[0];
        secondNumber = numbers[1];

        switch (operation) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '%':
                return firstNumber % secondNumber;
            case '/':
                return (Math.floorDiv(firstNumber, secondNumber));
            case '*':
                return firstNumber * secondNumber;
            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
            default:
                return 0;
        }
    }

    public void sort() {
        int i = 0;
        for (String math : saveTask) {
            if (math.equals("+") || math.equals("-") || math.equals("*") || math.equals("/") || math.equals("^") || math.equals("%")) {
                operation = math.charAt(0);
            } else {
                numbers[i] = Integer.parseInt(math);
                i++;
            }
        }
    }
}
