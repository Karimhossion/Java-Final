/*
 * Create a java program that performy base arithmetic  operations (addition, subtraction, multiplication). The program should define multiple versions of a method named “calculate” each performing a different arithmetic operation, specially implement the following-
    1.	Calculate (int a, int b) this version should add the two integers and return the result.
    2.	Calculate (double a , double b) this version should multiply.
    3.	Calculate (int a, int b, char c) this version should perform an operation based on the char value which can be (+, -, *, /, %).
 * 
 */

package Lab_1;

import java.util.Scanner;

public class Lab_7 {
        public static int calculate(int a, int b) {
        return a + b;
    }
    public static double calculate(double a, double b) {
        return a * b;
    }
    public static int Calculate(int a, int b, char op) {
        int result = 0;
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            result = a / b;
        } else if (op == '%') {
            result = a % b;
        }
        return result;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("_________Addition________: ");
            System.out.print("1st number : ");
            int a = input.nextInt();
            System.out.print("2nd number : ");
            int b = input.nextInt();
            System.out.println("Addition : " + calculate(a, b));

            System.out.println("_________Multiplication________: ");
            System.out.print("1st number : ");
            double c = input.nextDouble();
            System.out.print("2nd number : ");
            double d = input.nextDouble();
            System.out.println("Multiplication : " + calculate(c, d));

            System.out.println("_________Operation________: ");
            System.out.print("1st number : ");
            int e = input.nextInt(); 
            System.out.print("2nd number : ");
            int f = input.nextInt();
            
            System.out.print("Enter operation (+, -, *, /, %): ");
            char op = input.next().charAt(0);
            System.out.println("Operation Result: " + Calculate(e, f, op));
        }
    }

}
