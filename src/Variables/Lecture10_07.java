import java.util.Scanner;

public class Lecture10_07 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Please, enter your username:");
        String username = kb.next();


        // advanced data types
        String dbname;
        dbname = "Anton";
        System.out.println(dbname.equals(username));
        System.out.println(dbname.toUpperCase());
        System.out.println(dbname.length());
        System.out.println(dbname.substring(0,2));
        System.out.println(dbname.charAt(2));


    }
}
