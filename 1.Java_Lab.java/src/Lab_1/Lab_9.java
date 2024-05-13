/*
 * Problem Name : Implement a basic calculator application that supports addition, subtraction, multiplication, and division operations. Design the calculator system using abstract classes, interfaces, arithmetic operations, and exception handling to ensure flexibility and error handling.
Requirements:
1. Define an abstract class Calculator with the following abstract method:
calculate(): Performs the specified arithmetic operation on the two operands and returns the
result.
2. Define an interface Operatable with the following method:
isValidOperator(): Checks if the given operator is valid for arithmetic operations.
3. Implement the following concrete class:
BasicCalculator: Represents a basic calculator. Extend Calculator and implement the
Operatable interface.
4. Implement the calculate method to perform addition, subtraction, multiplication, and
division operations.
5. Implement the isValidOperator method to validate the supported operators (+, -, *, /).
6. Use exception handling to handle arithmetic exceptions such as division by zero or
invalid operators. 

 */

package Lab_1;

import java.util.Scanner;

abstract class Calculator {

    abstract double calculate(double op1, double op2, char operator);
}

interface Operatable {

    boolean isValidOperator(char operator);
}

class BasicCalculator extends Calculator implements Operatable {
    public boolean isValidOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }

    public double calculate(double op1, double op2, char operator) {
        if (isValidOperator(operator)) {
            switch (operator) {
                case '+':
                    return op1 + op2;
                case '-':
                    return op1 - op2;
                case '*':
                    return op1 * op2;
                case '/':
                    if (op2 == 0) {
                        throw new ArithmeticException("Division By Zero");
                    }
                    return op1 / op2;
                default:
                    throw new ArithmeticException("Operator is not valid");
            }
        } else {
            throw new ArithmeticException("Invalid operator");
        }
    }
}

public class Lab_9 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            BasicCalculator obj = new BasicCalculator();
            try {
                System.out.print("First Number : ");
                double op1 = input.nextDouble();
                System.out.print("Second Number : ");
                double op2 = input.nextDouble();

                System.out.print("Enter Operator (+,-,*,/) : ");
                char operator = input.next().charAt(0);

                double result = obj.calculate(op1, op2, operator);
                System.out.println("Result : " + result);
            } catch (Exception e) {
                System.out.println("Invalid" + e);
            }
        }
    }
}
