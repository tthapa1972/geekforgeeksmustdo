package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KadanesAlgorithmTest {

    KadanesAlgorithm kadanesAlgorithm;

    @Before
    public void setUp(){
        kadanesAlgorithm = new KadanesAlgorithm();
    }

    @Test
    public void test1(){
        Assert.assertEquals(7, kadanesAlgorithm.maxSubArraySumMethod1(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
    }

    @Test
    public void test2(){
        Assert.assertEquals(7, kadanesAlgorithm.maxSubArraySumMethod2(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
    }

    @Test
    public void test3(){
        Assert.assertEquals(7, kadanesAlgorithm.maxSubArraySumMethod3(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
    }

    @Test
    public void test4(){
        Assert.assertArrayEquals(new int[]{2, 6, 7}, kadanesAlgorithm.maxSubArraySumMethod4(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
    }

}
