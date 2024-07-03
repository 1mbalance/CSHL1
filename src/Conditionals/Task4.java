package Conditionals;

import java.util.Scanner;
import java.util.SortedMap;

public class Task4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Write three sides of a triangle:");
        int side1 = kb.nextInt();
        int side2 = kb.nextInt();
        int side3 = kb.nextInt();

        if (side1 == side2) {
            if (side1 == side3) System.out.println("Equilateral");
            else System.out.println("Isosceles");
        }
        if (side2 == side3) {
            if (side2 == side1) System.out.println("Equilateral");
            else System.out.println("Isosceles");
        }
        else {
            System.out.println("Scalene");
        }
    }
}
