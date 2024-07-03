package Conditionals;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter ages of Max, Alex, Ola in order:");
        int ageMax = kb.nextInt();
        int ageAlex = kb.nextInt();
        int ageOla = kb.nextInt();
        String youngest;

        if (ageMax < ageAlex) {
            if (ageMax < ageOla) youngest = "Max";
            else youngest = "Ola";
        }
        else {
            if (ageAlex < ageOla) youngest = "Max";
            else youngest = "Ola";
        }
        System.out.println("The youngest: " + youngest);


    }
}
