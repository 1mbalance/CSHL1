package Conditionals;
import java.util.Scanner;

public class Lecture10_28_23Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (num1 < num2) {
            if (num2 < num3) System.out.println("increasing");
            else System.out.println("neither");
        }
        else {
            if (num2 > num3) System.out.println("decreasing");
            else System.out.println("neither");
        }
    }
}
