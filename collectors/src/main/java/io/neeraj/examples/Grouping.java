package io.neeraj.examples;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Grouping {


    private static List<Person> personList = new ArrayList<>();

    public Grouping()  {
        personList.add( new Person( "Neeraj", 32 ) );
        personList.add( new Person( "Trisha", 30 ) );
        personList.add( new Person( "Manoj", 30 ) );
        personList.add( new Person( "Varun", 30 ) );
        personList.add( new Person( "Arpit", 33 ) );
        personList.add( new Person( "Rahul", 33 ) );
        personList.add( new Person( "Neha", 34 ) );
        personList.add( new Person( "Sovana", 34 ) );
    }

    public void run(){
        Map<Integer, List<Person>> collect = personList.stream().collect( Collectors.groupingBy( Person::getAge ) );
        System.out.println(collect);

        // grouping and mapping
        Map<Integer, List<String>> collect1 = personList.stream().collect( Collectors.groupingBy( Person::getAge, Collectors.mapping( Person::getName, Collectors.toList() ) ) );
        System.out.println(collect1);

        // grouping and counting
        Map<Integer, Long> collect2 = personList.stream().collect( Collectors.groupingBy( Person::getAge, Collectors.counting() ) );
        System.out.println(collect2);

        // countingAndThen example
        Map<Integer, Integer> collect3 = personList.stream().collect( Collectors.groupingBy( Person::getAge, Collectors.collectingAndThen( Collectors.counting(), Long::intValue ) ) );
        System.out.println(collect3);
    }

    @Getter
    @Setter
    @AllArgsConstructor
    private static class Person {
        private String name;

        private Integer age;
    }
}
