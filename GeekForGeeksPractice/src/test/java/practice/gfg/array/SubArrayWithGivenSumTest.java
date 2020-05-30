package practice.gfg.array;

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

    @Test
    public void test3(){
        Assert.assertArrayEquals(new int[]{2,4}, subArrayWithGivenSum.findSubArrayWithGivenSumMethod2(new int[]{1, 4, 20, 3, 10, 5}, 33));
    }

    @Test
    public void test4(){
        Assert.assertArrayEquals(new int[]{1,4}, subArrayWithGivenSum.findSubArrayWithGivenSumMethod2(new int[]{15, 2, 4, 8, 9, 5, 10, 23}, 23));
    }

    @Test
    public void test5(){
        Assert.assertArrayEquals(new int[]{2,4}, subArrayWithGivenSum.findSubArrayWithGivenSumMethod3(new int[]{1, 4, 20, 3, 10, 5}, 33));
    }

    @Test
    public void test6(){
        Assert.assertArrayEquals(new int[]{1,4}, subArrayWithGivenSum.findSubArrayWithGivenSumMethod3(new int[]{15, 2, 4, 8, 9, 5, 10, 23}, 23));
    }

    @Test
    public void test7(){
        Assert.assertArrayEquals(new int[]{0,3}, subArrayWithGivenSum.findSubArrayWithGivenSumMethod3(new int[]{10, 2, -2, -20, 10}, -10));
    }

    @Test
    public void test8(){
        Assert.assertArrayEquals(new int[]{0,-1}, subArrayWithGivenSum.findSubArrayWithGivenSumMethod3(new int[]{-10, 0, 2, -2, -20, 10}, 20));
    }
}
