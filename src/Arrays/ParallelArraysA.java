package Arrays;

public class ParallelArraysA {
    public static void main(String[] args) {
        int[] marks = {97,45,47,53,81};
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double average = (double) sum / marks.length;
        System.out.println("The average: " + average);
    }
}
