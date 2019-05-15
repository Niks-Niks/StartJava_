/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_1;

/**
 *
 * @author Admin
 */
public class Calculator {

    private int firstNumber;
    private char operation;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber, char operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    public void calculate() {
        int result = 0;
        System.out.println(operation);
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
            case 'm':
                result = Math.min(firstNumber, secondNumber);
                break;
            case 'M':
                result = Math.max(firstNumber, secondNumber);
                break;
        }

        System.out.println("Answer = " + result);
    }
}
