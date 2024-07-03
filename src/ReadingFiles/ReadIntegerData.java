package ReadingFiles;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import Arrays.BubbleSort;

public class ReadIntegerData {
    public static Integer[] DataArray = new Integer[100];
    static Integer FindValues(Integer num) {

        Integer count = 0;
        for (int i = 0; i < DataArray.length; i++) {
            if (DataArray[i] == num) {
                count++;
            }

        }
        return count;
    }
    static void fillFile() {
        Random rand = new Random();
        rand.nextInt(101);
        try {
            FileWriter fileInput = new FileWriter("/Users/admin/IB1/CSHL1/src/ReadingFiles/IntegerData.txt");
            BufferedWriter numbersInput = new BufferedWriter(fileInput);
            for (int i = 0; i < DataArray.length; i++) {
                numbersInput.write(String.valueOf(rand.nextInt(1,101)));
                numbersInput.newLine();
            }
            numbersInput.close();
            fileInput.close();

        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    static Integer[] BubbleSort() {
        Integer[] array = new Integer[DataArray.length];
        array = DataArray;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i -1; j++) {
                if (array[j] > array[j + 1]) {
                    Integer temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
       return array;
    }
    static Integer[] ReadFile() {
        try {
            FileReader fileReader = new FileReader("/Users/admin/IB1/CSHL1/src/ReadingFiles/IntegerData.txt");
            BufferedReader numbersReader = new BufferedReader(fileReader);
            for (int i = 0; i < DataArray.length; i++) {
                DataArray[i] = Integer.valueOf(numbersReader.readLine());
            }
            numbersReader.close();
            fileReader.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return DataArray;


    }
    public static void main(String[] args) {
        fillFile();
        System.out.println(Arrays.toString(ReadFile()));
        System.out.println(FindValues(54));
        System.out.println(Arrays.toString(BubbleSort()));
    }
}
