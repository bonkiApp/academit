package ru.kibon.range;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите число начала диапазона:");
            double newFrom = scanner.nextDouble();
            System.out.println("Введите число конца диапазона:");
            double newTo = scanner.nextDouble();
            System.out.println("Введите число, которое будем проверять на вхождение в диапазон:");
            double number = scanner.nextDouble();

            Range newRange = new Range(newFrom, newTo);

            String answer = (newRange.isInside(number)) ? "" : " не";
            System.out.printf("Ваше число%s входит в заданный диапазон.\n", answer);

            double range = newRange.findRange(newFrom, newTo);
            System.out.printf("Длина диапазона %f", range);

        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число, начните заново.");
        }


    }
}



