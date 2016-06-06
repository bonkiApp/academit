package ru.kibon.scan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("Scan/src/textRead.txt"))) {
            ArrayList<String> list = new ArrayList<>();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                list.add(line);
            }
            System.out.print(list);
        }
    }
}
