package Arrays;

import java.util.Arrays;

public class ParallelArraysD {
    public static void main(String[] args) {
        int[] marks = {97,45,47,53,81};
        char[] names = {'A','B','C','D','E'};

        int max = marks[0];
        int min = marks[0];
        char maxName = names[0];
        char minName = names[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                maxName = names[i];
            }
            if (min > marks[i]) {
                min = marks[i];
                minName = names[i];
            }
        }
        System.out.println("The student with the lowest mark of " + min +   " is " + minName);
        System.out.println("The student with the highest mark of " + max +   " is " + maxName);
    }
}
