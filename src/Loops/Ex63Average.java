package Loops;

import java.util.Scanner;

public class Ex63Average {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int age = 1;
        double cost = 0;
        System.out.println("Enter the age of each guest on each line, 0 indicating there are no more of them:");
        while (age != 0) {
            age = kb.nextInt();
            if (age >= 65) {
                cost += 18;
            }
            else if (age > 3 && age < 12) {
                cost += 14;
            }
            else {
                cost += 23;
            }

        }
        System.out.printf("The cost: $%.2f", cost);
    }
}
