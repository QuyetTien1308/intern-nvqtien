package com.example.tien.FinalExercise.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public void readFile() throws IOException {
        String url = "D:\\Intern-TMA\\intern-nvqtien\\kysu.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream, "UTF-8");
        try {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }
        }
    }
}
