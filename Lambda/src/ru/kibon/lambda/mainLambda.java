package ru.kibon.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mainLambda {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Иван", 22));
        persons.add(new Person("Сергей", 29));
        persons.add(new Person("Петр", 31));
        persons.add(new Person("Иван", 17));
        persons.add(new Person("Дуся", 10));

        String disNames = persons.stream()
                .map(n -> n.getName())
                .distinct()
                .collect(Collectors.joining(", ", "Имена: ", "."));

        System.out.println(disNames);

        persons.stream()
                .filter(p -> p.getAge() < 18)
                .mapToInt(x -> x.getAge())
                .average()
                .ifPresent(System.out::println);

        Map<String, List<Person>> persByName = persons.stream()
                .collect(Collectors.groupingBy(p -> p.getName())); //средний возраст тезок

        System.out.println(persByName);

        persons.stream()
                .filter(p -> p.getAge() > 20 && p.getAge() < 45)
                .sorted((Person p1, Person p2) -> p2.getAge() - p1.getAge())
                .map(n -> n.getName())
                .forEach(System.out::println);

    }
}

