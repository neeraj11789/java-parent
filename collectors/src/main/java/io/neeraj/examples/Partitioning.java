package io.neeraj.examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {

    public void run(){

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10);

        Map<Boolean, List<Integer>> collect = list.stream().collect( Collectors.partitioningBy( integer -> integer % 2 == 0 ) );
        System.out.println(collect);
    }
}
