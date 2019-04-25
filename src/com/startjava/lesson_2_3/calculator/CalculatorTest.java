import java.util.Scanner;


public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer = null;

        do {
            System.out.print("Write first number: ");
            calculator.setFirstNum(sc.nextInt());

            System.out.print("Write you operation: ");
            calculator.setOperation(sc.next().charAt(0));

            System.out.print("Write second number: ");
            calculator.setSecondNum(sc.nextInt());
            sc.nextLine();

            calculator.calculate();
            
            
            do{               
                System.out.println("Do you want to continue? [Yes/No]");
                answer = sc.nextLine();
                if (answer != "Yes" | answer != "No") {
                    System.out.println("Should be only Yes or No!");
                }
            } while (answer == "No" || answer == "Yes");
        } while (answer.equals("Yes"));
    }
}
