package ReadingFiles;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class HighScore {
    public static Integer[] scores = new Integer[11];
    public static String[] names = new String[11];
    public static void ReadHighScores(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader scoreReader = new BufferedReader(fileReader);
            for (int i = 0; i < scores.length - 1; i++) {
                names[i] = scoreReader.readLine();
                scores[i] = Integer.valueOf(scoreReader.readLine());
            }
            scoreReader.close();
            fileReader.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }
    public static void OutputHighScores(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader scoreReader = new BufferedReader(fileReader);
            for (int i = 0; i < scores.length - 1; i++) {
                String name = scoreReader.readLine();
                String score = scoreReader.readLine();
                System.out.println(name + " " + score);
            }
            scoreReader.close();
            fileReader.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }
    public static void WriteTopTen(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileInput = new FileWriter(path);
            BufferedWriter numbersInput = new BufferedWriter(fileInput);
            for (int i = 0; i < scores.length - 1; i++) {
                numbersInput.write(names[i]);
                numbersInput.newLine();;
                numbersInput.write(String.valueOf(scores[i]));
                numbersInput.newLine();
            }
            numbersInput.close();
            fileInput.close();

        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void CreateNewLists(String newName, Integer newScore) {
        System.out.println("Before");
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(scores));
        String[] namesCopy = Arrays.copyOf(names, names.length);
        Integer[] scoresCopy = Arrays.copyOf(scores, scores.length);
        int pos = 0;
        for (int i = 0; i < scoresCopy.length; i++) {
            if (newScore > scoresCopy[i]) {
                pos = i + 1;
                scores[i] = newScore;
                names[i] = newName;
                break;
            }
        }
        for (int i = pos; i < scores.length; i++) {
            scores[i] = scoresCopy[i - 1];
            names[i] = namesCopy[i - 1];
        }
        System.out.println("After");
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(scores));
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // /Users/admin/IB1/CSHL1/src/ReadingFiles/HighScore.txt
        System.out.println("Input the absolute path of HighScore.txt:");
        String path = kb.nextLine();
        System.out.println("Input the absolute path of NewHighScore.txt:");
        String newPath = kb.nextLine();
        ReadHighScores(path);
        OutputHighScores(path);

        String newName = "";
        Integer newScore = 0;
        while (newName.length() != 3) {
            System.out.println("Input a new player name of three letters");
            newName = kb.nextLine();
        }
        while (!(1 <= newScore && newScore <= 100000)) {
            System.out.println("Input a new player score between 1 and 100000 inclusive");
            newScore = kb.nextInt();
        }
        CreateNewLists(newName, newScore);
        WriteTopTen(newPath);
    }
}
