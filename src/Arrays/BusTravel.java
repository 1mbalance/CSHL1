package Arrays;

import java.util.Scanner;

public class BusTravel {
    final static String[] names = {"Oppox","Thamesley","Brinkley","Kiko","Endsley","Kingsley","Allapay","Kronos","Longlines","Dovely"};
    final static double[] distances = {0,1.2,1.0,2.2,1.3,1.4,0.9,1.1,1.2,0.9};

    public static double costPerKm(int age) {
        double cost = 0.2;
        if (age < 5) {
            return 0;
        }
        else if (age <= 15) {
            return cost * 0.5;
        }
        else if (age >= 65) {
            return cost * 0.7;
        }
        else {
            return cost;
        }

    }
    public static int getIndex(String name) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }

        }
        return -1;
    }
    public static double calcDistance(int p1, int p2) {

        double distance = 0;


        for (int i = p1 + 1; i <= p2; i++) {
            distance += distances[i];
        }
        return distance;

    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String p1 = kb.nextLine();
        String p2 = kb.nextLine();
        int age = kb.nextInt();
        int index1 = getIndex(p1);
        int index2 = getIndex(p2);
        if (index1 == -1 || index2 == -1) {
            System.out.println("One or more stations not found");
        }
        else {
            double distance;
            if (index1 < index2) {

                distance = calcDistance(index1, index2);
            } else {
                distance = calcDistance(index2, index1);
            }
            System.out.println("€" + String.format("%.2f", costPerKm(age) * distance));
        }

    }


}
