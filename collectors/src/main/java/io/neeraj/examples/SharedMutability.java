package io.neeraj.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SharedMutability {

    public void run(){

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10);
        List<Integer> doubleList = new ArrayList<>();

        list.stream()
                .filter( i -> i%2 ==0 )
                .map( i -> i*2 )
                .forEach( i -> doubleList.add( i ) ); // DONT DO THIS - PROBLEM WITH PARALLEL STREAM
        System.out.println(doubleList);

        List<Integer> doubleInteger = list.stream()
                .filter( i -> i % 2 == 0 )
                .map( i -> i * 2 )
                .collect( Collectors.toList() );
        System.out.println(doubleInteger);
    }
}
