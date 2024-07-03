package Conditionals;
import java.util.Scanner;

public class Lecture10_14_23Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input three numbers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        System.out.print("The greatest number: ");
        // without &&(and operator) and Math.max()
        if (number1 > number2) {
            if (number1 > number3) System.out.println(number1);
            else System.out.println(number3);
        }
        else {
            if (number2 > number3) System.out.println(number2);
            else System.out.println(number3);
        }



    }
}
