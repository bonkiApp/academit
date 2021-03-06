package ru.kibon.lambda;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainLambda {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Иван", 22));
        persons.add(new Person("Сергей", 29));
        persons.add(new Person("Петр", 31));
        persons.add(new Person("Иван", 17));
        persons.add(new Person("Дуся", 10));

        String distinctNames = persons.stream()
                .map(Person::getName)
                .distinct()
                .collect(Collectors.joining(", ", "Имена: ", "."));
        System.out.println(distinctNames);

        System.out.print("Средний возраст людей младше 18 лет: ");
        persons.stream()
                .filter(p -> p.getAge() < 18)
                .mapToInt(Person::getAge)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Средний возраст людей с одинаковым именем:");
        Map<String, IntSummaryStatistics> groupByName = persons.stream()
                .collect(Collectors.groupingBy(Person::getName, Collectors.summarizingInt(Person::getAge)));
        for (Map.Entry<String, IntSummaryStatistics> item : groupByName.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue().getAverage());
        }

        System.out.println("Люди в возрасте от 45 до 20:");
        persons.stream()
                .filter(p -> p.getAge() >= 20 && p.getAge() <= 45)
                .sorted((Person p1, Person p2) -> p2.getAge() - p1.getAge())
                .map(Person::getName)
                .forEach(System.out::println);
    }
}

