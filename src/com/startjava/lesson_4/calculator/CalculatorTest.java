package com.startjava.lesson_2_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = null;
        int result = 0;
        int repeat = 0;

        String writeMathTask = null;
        String[] saveTask = null;
        String[] saveValues = new String[0];

        do {
            System.out.print("Enter math expression: ");

            writeMathTask = sc.nextLine();
            saveTask = writeMathTask.split(" ");

            Calculator calculator = new Calculator(saveTask);

            saveValues = Arrays.copyOf(saveValues, saveValues.length + 1);
            saveValues[saveValues.length - 1] = writeMathTask;

            calculator.sort();

            result = calculator.calculate();

            System.out.println("Answer => " + result);

            do {
                System.out.println("\nDo you want to continue? [Yes/No]");
                answer = sc.nextLine();
                if (!answer.equals("Yes") && !answer.equals("No")) {
                    System.out.println("Should be only Yes or No!");
                }
            } while (!answer.equals("Yes") && !answer.equals("No"));

            if (answer.equals("No")) {
                System.out.println("You math operation :");
                for (String out : saveValues) {
                    System.out.println(out);
                }
            }
        } while (answer.equals("Yes"));
    }

}
