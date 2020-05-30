package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayZigZagFashionTest {

    ArrayZigZagFashion arrayZigZagFashion;

    @Before
    public void setUp(){
        arrayZigZagFashion = new ArrayZigZagFashion();
    }

    @Test
    public void test1(){
        Assert.assertArrayEquals(new int[]{3, 7, 4, 8, 2, 6, 1}, arrayZigZagFashion.zigzagFashion(new int[]{4, 3, 7, 8, 6, 2, 1}));
    }

    @Test
    public void test2(){
        Assert.assertArrayEquals(new int[]{1, 4, 2, 3}, arrayZigZagFashion.zigzagFashion(new int[]{1, 4, 3, 2}));
    }
}
