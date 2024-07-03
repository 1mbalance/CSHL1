package Loops;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rd = new Random();
        int numOfNumbers, numOfPositive, number, sum;
        sum = 0;
        numOfPositive = 0;
        System.out.println("Enter the numbers to be randomly generated:");
        numOfNumbers = kb.nextInt();
        for (int i = 0; i < numOfNumbers; i++) {
            System.out.println("The randomly generated number:");
            number = rd.nextInt(-50, 50);
            System.out.println(number);
            if (number > 0) {
                sum += number;
                numOfPositive++;
            }


        }
        double average = (double) sum / numOfPositive;
        System.out.println(sum);
        System.out.println(average);
    }
}
