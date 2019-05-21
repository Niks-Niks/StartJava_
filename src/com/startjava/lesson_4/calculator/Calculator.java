package com.startjava.lesson_2_4.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private String[] mathExpression;

    public Calculator(String[] mathExpression) {
        this.mathExpression = mathExpression;
    }

    public int calculate() {
        firstNumber = Integer.parseInt(mathExpression[0]);
        secondNumber = Integer.parseInt(mathExpression[2]);
        
        switch (mathExpression[1]) {
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
