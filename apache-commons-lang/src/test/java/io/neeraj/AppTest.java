package io.neeraj;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Triple;
import org.junit.Test;
import org.testng.Assert;

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
}
