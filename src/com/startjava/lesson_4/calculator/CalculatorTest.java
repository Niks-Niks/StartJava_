package com.startjava.lesson_2_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = null;
        String[] mathExpression = null;

        do {
            System.out.print("Enter math expression: ");
            mathExpression = sc.nextLine().split(" ");

            Calculator calculator = new Calculator(mathExpression);
            System.out.println("Answer => " + calculator.calculate());
            do {
                System.out.println("\nDo you want to continue? [Yes/No]");
                answer = sc.nextLine();
                if (!answer.equals("Yes") && !answer.equals("No")) {
                    System.out.println("Should be only Yes or No!");
                }
            } while (!answer.equals("Yes") && !answer.equals("No"));
        } while (answer.equals("Yes"));
    }
}
