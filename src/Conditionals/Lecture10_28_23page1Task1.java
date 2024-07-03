package Conditionals;
import java.util.Scanner;

public class Lecture10_28_23page1Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the air temperature: ");
        int tAir = input.nextInt();
        System.out.print("Enter the steam temperature: ");
        int tSteam = input.nextInt();
        double efficiency;
        if (tSteam < 373) {
            efficiency = 0;
        }
        else {
            efficiency = 1 - ((double) tAir / tSteam);
        }
        System.out.println("The effeciency: " + efficiency);
    }
}
