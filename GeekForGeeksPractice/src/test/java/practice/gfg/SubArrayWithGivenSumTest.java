package practice.gfg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubArrayWithGivenSumTest {

    SubArrayWithGivenSum subArrayWithGivenSum;

    @Before
    public void setUp(){
         subArrayWithGivenSum = new SubArrayWithGivenSum();
    }

    @Test
    public void test1(){
        Assert.assertArrayEquals(new int[]{2,4}, subArrayWithGivenSum.findSubArrayWithGivenSumMethod1(new int[]{1, 4, 20, 3, 10, 5}, 33));
    }

    @Test
    public void test2(){
        Assert.assertArrayEquals(new int[]{1,4}, subArrayWithGivenSum.findSubArrayWithGivenSumMethod1(new int[]{15, 2, 4, 8, 9, 5, 10, 23}, 23));
    }
}
