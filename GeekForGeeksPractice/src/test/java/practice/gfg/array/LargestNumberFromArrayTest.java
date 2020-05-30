package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LargestNumberFromArrayTest {

    LargestNumberFromArray largestNumberFromArray;

    @Before
    public void setUp(){
        largestNumberFromArray = new LargestNumberFromArray();
    }

    @Test
    public void test1(){
        Assert.assertEquals("6054854654", largestNumberFromArray.findLargestNumber(new String[]{"54", "546", "548", "60"}));
    }

    @Test
    public void test2(){
        Assert.assertEquals("998764543431", largestNumberFromArray.findLargestNumber(new String[]{"1", "34", "3", "98",
                "9", "76", "45", "4"}));
    }

}
