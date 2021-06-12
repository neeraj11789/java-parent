package io.neeraj.examples;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    private static List<Person> personList = new ArrayList<>();

    public Joining() {
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
        String collect = personList.stream()
                .filter( person -> person.getName().length() >= 5 )
                .map( Person::getName )
                .map( String::toUpperCase )
                .collect( Collectors.joining( ", " ) );

        System.out.println(collect);
    }


    @Getter
    @Setter
    @AllArgsConstructor
    private static class Person {
        private String name;

        private Integer age;
    }
}
