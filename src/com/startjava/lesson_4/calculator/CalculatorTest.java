/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_1;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;
        char operation = 0;
        Scanner sc = new Scanner(System.in);
        String answer = null;
        boolean firstNumOn = true;

        do {
            System.out.print("Enter math expression: ");
            String mathExpression = sc.nextLine();

            for (String mathOut : mathExpression.split(" ")) {

                if (firstNumber == 0 && firstNumOn == true) {
                    firstNumber = Integer.parseInt(mathOut);
                    firstNumOn = false;
                } else if (mathOut.equals(" ")) {
                    continue;
                } else if (mathOut.equals("+") || mathOut.equals("-") || mathOut.equals("/") || mathOut.equals("*") || mathOut.equals("^") || mathOut.equals("%") || mathOut.equals("m") || mathOut.equals("M")) {
                    operation = mathOut.charAt(0);
                } else if (secondNumber == 0 && firstNumOn == true) {
                    secondNumber = Integer.parseInt(mathOut);
                } else {
                    System.out.println("Operation must be:\n + , - , * , / , ^ , % , m - min number , M - max number");
                    break;
                }
            }
            Calculator calculator = new Calculator(firstNumber, secondNumber, operation);

            calculator.calculate();

            do {
                System.out.println("\nDo you want to continue? [Yes/No]");
                answer = sc.nextLine();
                if (!answer.equals("Yes") && !answer.equals("No")) {
                    System.out.println("Should be only Yes or No!");
                }
            } while (!answer.equals("Yes") && !answer.equals("No"));
        } while (answer.equals(
                "Yes"));
    }

}
