package ru.kibon.lambda;

import java.util.Scanner;
import java.util.stream.Stream;

public class NumberStream {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов для вычисления корней.");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            Stream.iterate(1.0, x -> x + 1)
                    .map(Math::sqrt)
                    .limit(n)
                    .forEach(System.out::println);
        } else {
            System.out.println("Вы ввели не целое число.");
        }
    }
}
