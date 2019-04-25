public class Calculator {

    private int firstNumber;
    private char operation;
    private int secondNumber;

    public void setFirstNum(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setSecondNum(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void calculate() {
        int result = 0;

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
            case '^':
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.println("Available math operations: '+', '-', '*', '/', '^', '%'");
        }
        System.out.println("Answer = " + result);
    }
}