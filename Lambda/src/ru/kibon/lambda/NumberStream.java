package ru.kibon.lambda;

import java.util.Scanner;
import java.util.stream.Stream;

public class NumberStream {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов для вычисления корней.");
        Scanner scanner = new Scanner(System.in);
        int n;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            Stream.generate(Math::random)
                    .limit(n)
                    .map(x -> Math.sqrt(x * 1000))
                    .forEach(System.out::println);
        } else {
            System.out.println("Вы ввели не целое число.");
        }
    }
}
