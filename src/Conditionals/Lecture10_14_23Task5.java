package Conditionals;
import java.util.Scanner;

public class Lecture10_14_23Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter capacity in gallons:");
        int capacity = input.nextInt();
        System.out.println("Enter gage reading in percent:");
        int gauge = input.nextInt();
        System.out.println("Enter the miles per gallon of the car:");
        int mpg = input.nextInt();
        double miles = capacity * (gauge / 100.0) * mpg;
        if (miles < 200) {
            System.out.println("Get Gas!");
        }
        else {
            System.out.println("Safe to Proceed");
        }

    }
}
