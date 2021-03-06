package ru.kibon.MyRange;

import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        MyRange range1 = new MyRange(-15, 20);
        double number = 11.4;

        String answer = (range1.isInside(number)) ? "" : " не";
        System.out.printf("Ваше число%s входит в заданный интервал.%n", answer);

        double range = range1.findRange(range1);
        System.out.printf("Длина интервала %f%n", range);

        MyRange range2 = new MyRange(-5, 15);

        MyRange crossR = range1.crossingRanges(range2);
        System.out.printf("Интервал пересечения: %s%n", range1.printRange(crossR));

        MyRange joinR = range1.joinRanges(range2);
        System.out.printf("Интервал объединения: %s%n", range1.printRange(joinR));

        MyRange subR[] = range1.subtractRanges(range2);
        System.out.printf("Разность интервалов: %s", Arrays.toString(subR));

//        System.out.println(range1.printRange(range1));



    }
}