package ru.kibon.scan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter("Scan/src/textWrite.txt");
             Scanner scanner = new Scanner(new FileInputStream("Scan/src/textRead.txt"))) {
            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine().toUpperCase());
            }
        }
    }
}
