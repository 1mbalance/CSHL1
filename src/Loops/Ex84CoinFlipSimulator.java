package Loops;

import java.util.Random;


public class Ex84CoinFlipSimulator {
    public static void main(String[] args) {

        Random rd = new Random();
        String line = "";
        int total = 0;
        int sum = 0;
        int t = 1;
        int flip;
        int prevFlip = -1;
        double average;
        for (int i = 0; i < 10; i++) {
            while (t < 3) {

                flip = rd.nextInt(0, 2);

                if (prevFlip == flip) {
                    t++;
                }
                else {
                    t = 1;
                }

                if (flip == 0) {
                    line += "T ";
                }
                else {
                    line += "H ";
                }
                prevFlip = flip;
                total++;
            }
            line += "(" + total + " flips)";
            System.out.println(line);
            line = "";
            sum += total;
            total = 0;
            t = 0;

        }
        average = (double) sum / 10;
        System.out.println("On average, " + average + " flips were needed.");
    }
}
