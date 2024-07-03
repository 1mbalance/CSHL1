import java.util.Scanner;

public class Lecture09_30_23Task1 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        // Finding the average of two integers instead of the sum
        System.out.println("Enter the first integer number:");
        int number1 = numbers.nextInt();
        System.out.println("Enter the second integer number:");
        int number2 = numbers.nextInt();
        double average = (number1 + number2) / 2.0;

        System.out.println("The average of " + number1 + " and " + number2 + ": " + average);

    }
}
