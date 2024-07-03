package Loops;
import java.util.Arrays;
import java.util.Random;

import Arrays.BubbleSort;

public class RandomUniqueArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] rNum = new int[100];

        for (int i = 0; i < rNum.length; i++) {
            int n = 0;
            boolean noDublicate = false;
            while (!noDublicate){
                n = rand.nextInt(201);
                noDublicate = true;

                for (int j = 0; j < i; j++) {
                    if (rNum[j] != n) {
                        noDublicate = true;
                        break;
                    }


                }

            }
            rNum[i] = n;
        }

        System.out.println(Arrays.toString(rNum));
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(rNum)));
    }
}
