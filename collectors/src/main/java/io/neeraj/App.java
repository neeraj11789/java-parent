package io.neeraj;

import io.neeraj.examples.Grouping;
import io.neeraj.examples.Joining;
import io.neeraj.examples.Partitioning;
import io.neeraj.examples.SharedMutability;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        SharedMutability sharedMutability = new SharedMutability();
        sharedMutability.run();

        Partitioning partitioning = new Partitioning();
        partitioning.run();

        Joining joining = new Joining();
        joining.run();

        Grouping grouping = new Grouping();
        grouping.run();
    }
}
