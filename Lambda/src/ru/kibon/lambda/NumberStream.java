package ru.kibon.lambda;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class NumberStream {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов для вычисления корней.");
        Scanner scanner = new Scanner(System.in);
        int n;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            Stream.generate(new Random()::nextDouble)
                    .limit(n)
                    .map(Math::sqrt)
                    .forEach(System.out::println);
        }
        else{
            System.out.println("Вы ввели не целое число.");
        }


    }


}
