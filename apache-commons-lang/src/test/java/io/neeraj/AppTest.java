package io.neeraj;

import static org.junit.Assert.assertTrue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Triple;
import org.junit.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static MutablePair<String, String> mutablePair;

    private static ImmutablePair<String, String> immutablePair = new ImmutablePair<>("leftElement", "rightElement");

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1(){
        Assert.assertTrue( StringUtils.isBlank( " " ) );

        Assert.assertFalse( StringUtils.isEmpty( " " ) );

        String[] array = {"a", "b", "c"};
        Assert.assertEquals( ArrayUtils.toString( array ), "{a,b,c}" );

        int[] array2 = {1, 2, 3, 4, 5, 6};
        Assert.assertEquals( NumberUtils.max(array2), 6);
    }

    @Test
    public void test2(){
        mutablePair = new MutablePair<>("leftElement", "rightElement");
        Assert.assertEquals(mutablePair.getLeft(), "leftElement");

        Triple<String, String, String> triple = Triple.of( "leftElement", "middleElement", "rightElement" );
        Assert.assertEquals( triple.getLeft(), "leftElement" );
    }

    @Test
    public void test3(){
        Customer customer1 = new Customer(1, "Daniel", "locality1", "city1");
        Customer customer2 = new Customer(2, "Fredrik", "locality2", "city2");
        Customer customer3 = new Customer(3, "Kyle", "locality3", "city3");
        Customer customer4 = new Customer(4, "Bob", "locality4", "city4");
        Customer customer5 = new Customer(5, "Cat", "locality5", "city5");
        Customer customer6 = new Customer(6, "John", "locality6", "city6");

        List<Customer> list1 = Arrays.asList(customer1, customer2, customer3);
        List<Customer> list2 = Arrays.asList(customer4, customer5, customer6);
        List<Customer> list3 = Arrays.asList(customer1, customer2);

        List<Customer> linkedList1 = new LinkedList<>(list1);

        Assert.assertTrue( CollectionUtils.isNotEmpty( list1 ) );
    }


    @AllArgsConstructor
    public class Customer {
        private Integer id;
        private String name;
        private String address;
        private String city;

        // standard getters and setters
    }
}
