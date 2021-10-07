package ch02.QClassAdapter;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // package名から察するにDesigenPatternsフォルダに入っているファイルに反応するらしい
        String filename = "file.txt";
        FileIO f = new FileProperties();
        try {
            f.readFromFile(filename);
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("ch02_newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
