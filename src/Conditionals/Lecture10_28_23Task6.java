package Conditionals;
import java.util.Scanner;

public class Lecture10_28_23Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In each line, first enter sex, then the age and whether the person is married, true or false.");
        String sex = input.nextLine();
        int age = input.nextInt();
        boolean married = input.nextBoolean();
        sex = sex.toLowerCase();
        if (married) {
            System.out.println("Insured");
        }
        else {
            if (sex.equals("male")) {
                if (age >= 30) System.out.println("Insured");
                else System.out.println("Not insured");
            }

            else if (sex.equals("female")) {
                if (age >= 25) System.out.println("Insured");
                else System.out.println("Not insured");
            }
            else {
                System.out.println("Not insured");
            }
        }


    }
}
