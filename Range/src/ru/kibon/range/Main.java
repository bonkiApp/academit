package ru.kibon.range;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите первое число интервала:");
            double newFrom = scanner.nextDouble();
            System.out.println("Введите второе число интервала:");
            double newTo = scanner.nextDouble();
            System.out.println("Введите число, которое будем проверять на вхождение в интервал:");
            double number = scanner.nextDouble();

            Range newRange = new Range(newFrom, newTo);

            String answer = (newRange.isInside(number)) ? "" : " не";
            System.out.printf("Ваше число%s входит в заданный интервал.\n", answer);

            double range = newRange.findRange(newFrom, newTo);
            System.out.printf("Длина интервала %f\n", range);

            System.out.println("Введите первое число другого интервала:");
            double newFrom1 = scanner.nextDouble();
            System.out.println("Введите второе число другого интервала:");
            double newTo1 = scanner.nextDouble();

            String crossR = newRange.crossingRanges(newFrom, newTo, newFrom1, newTo1);
            System.out.println(crossR);

            String joinR = newRange.joinRanges(newFrom, newTo, newFrom1, newTo1);
            System.out.println(joinR);

        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число, начните заново.");
        }


    }
}



