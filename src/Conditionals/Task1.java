package Conditionals;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length and width of a rectangle in order:");
        int length = kb.nextInt();
        int width = kb.nextInt();
        int area = length * width;
        int perimeter = 2 * (length + width);
        
        if (area > perimeter) System.out.println("The area is greater than the perimeter.");
        else System.out.println("The area is not greater than the perimeter.");
    }
}
