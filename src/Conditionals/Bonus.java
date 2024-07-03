package Conditionals;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter hardness, carbon content, and tensile strength in order:");
        int hardness = kb.nextInt();
        double content = kb.nextDouble();
        int tensileStrength = kb.nextInt();

        boolean condition1 = hardness > 50;
        boolean condition2 = content < 0.7;
        boolean condition3 = tensileStrength > 5600;

        if (condition1) {
            if (condition2) {
                if (condition3) System.out.println("Grade 10");
                else System.out.println("Grade 9");
            }
            else if (condition3) System.out.println("Grade 7");
            else System.out.println("Grade 6");
        }
        else if (condition2) {
            if (condition3) System.out.println("Grade 8");
            else System.out.println("Grade 6");
        }
        else if (condition3) {
            System.out.println("Grade 6");
        }
        else {
            System.out.println("Grade 5");
        }
    }
}
