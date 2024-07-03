package Conditionals;
import java.util.Scanner;

public class Lecture10_28_23page2Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first operand: ");
        int num1 = input.nextInt();
        System.out.print("Enter the first operand: ");
        int num2 = input.nextInt();
        System.out.print("Enter the symbol of an operation(+,-,*,/): ");
        char operator = input.next().charAt(0);
        double result;

        if (operator == '+') {
            result = num1 + num2;
        }
        else if (operator == '-') {
            result = num1 - num2;
        }
        else if (operator == '*') {
            result = num1 * num2;
        }
        else {
            result = (double )num1 / num2;
        }
        System.out.println("Result: " + result);

    }
}
