package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrappingWaterTest {

    TrappingRainWater trappingRainWater;

    @Before
    public void setUp(){
        trappingRainWater = new TrappingRainWater();
    }

    @Test
    public void test1(){
        Assert.assertEquals(6, trappingRainWater.maxWater(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    public void test2(){
        Assert.assertEquals(6, trappingRainWater.maxWater1(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    public void test3(){
        Assert.assertEquals(6, trappingRainWater.maxWater2(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
