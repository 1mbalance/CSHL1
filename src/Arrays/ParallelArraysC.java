package Arrays;

public class ParallelArraysC {
    public static void main(String[] args) {
        int[] marks = {97,45,47,53,81};
        char[] names = {'A','B','C','D','E'};
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double average = (double) sum / marks.length;
        System.out.println("The average: " + average);
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > average) {
                System.out.println("Student " + names[i] + " scored above average with " + marks[i]);
            }

        }
    }
}
