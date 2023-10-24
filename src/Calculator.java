import java.util.Scanner;

public class Calculator {
    public char operator;
    public float result;
    public boolean firstNumber = true;


    public Calculator() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                if (firstNumber) {
                    System.out.println("Please enter number (or 'q' to quit)");
                } else {
                    System.out.println("Please enter next number (or 'q' to quit)");
                }

                if (scanner.hasNext("q")){
                    break;
                }else if (scanner.hasNextFloat()){
                    float number = scanner.nextFloat();
                    if (firstNumber){
                        result = number;
                        firstNumber = false;
                    } else {
                        System.out.println("What do you want to do? (/ , * , - , +)");
                        operator = scanner.next().charAt(0);

                        if ((operator == '/') && (number == 0)){
                            System.out.println("Error: Division by zero");
                            break;
                        }else {
                            switch (operator) {
                                case '/':
                                    result /= number;
                                    break;
                                case '*':
                                    result *= number;
                                    break;

                                case '+':
                                    result += number;
                                    break;

                                case '-':
                                    result -= number;
                                    break;

                                default:
                                    System.out.println("Error: Operator unknown");
                                    return;
                            }
                            System.out.println("Result = " + result);
                        }
                    }
                }
            }
    }

}
