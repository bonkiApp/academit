package ru.kibon.lambda;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов для ряда Фибоначчи:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Число должно быть положительным");
            } else {
                Stream.iterate(new long[]{0, 1}, x -> new long[]{x[1], x[0] + x[1]})
                        .limit(n)
                        .forEach(x -> System.out.println(x[0]));
            }
        } else {
            System.out.println("Вы ввели не целое число.");
        }

    }
}
