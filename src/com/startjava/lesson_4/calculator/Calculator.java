package com.startjava.lesson_2_4.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private String[] saveTask;

    public Calculator(String[] saveTask) {
        this.saveTask = saveTask;
    }

    public int calculate() {
        firstNumber = Integer.parseInt(saveTask[0]);
        secondNumber = Integer.parseInt(saveTask[2]);
        
        switch (saveTask[1]) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "%":
                return firstNumber % secondNumber;
            case "/":
                return (Math.floorDiv(firstNumber, secondNumber));
            case "*":
                return firstNumber * secondNumber;
            case "^":
                return (int) Math.pow(firstNumber, secondNumber);
            default:
                return 0;
        }
    }
}
