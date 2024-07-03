import java.util.Scanner;

public class Lecture10_07_23Task2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input the nominator:");
        int nominator = kb.nextInt();
        System.out.println("Input the denominator:");
        int denominator = kb.nextInt();
        int remainder = nominator % denominator;
        

        System.out.println("The remainder: "+remainder);
    }
}
