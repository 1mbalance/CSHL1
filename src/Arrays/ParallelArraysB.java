package Arrays;

public class ParallelArraysB {
    public static void main(String[] args) {
        int[] marks = {97,45,47,53,81};
        char[] names = {'A','B','C','D','E'};

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + names[i] + " scored " +  marks[i]);
        }

    }
}
