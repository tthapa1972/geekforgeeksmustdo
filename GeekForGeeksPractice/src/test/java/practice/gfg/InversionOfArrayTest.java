package practice.gfg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InversionOfArrayTest {

    InversionOfArray inversionOfArray;

    @Before
    public void setUp(){
        inversionOfArray = new InversionOfArray();
    }

    @Test
    public void test1(){
        Assert.assertEquals(5, inversionOfArray.noOfInversion(new int[]{ 1, 20, 6, 4, 5 }, 5));
    }

    @Test
    public void test2(){
        Assert.assertEquals(5, inversionOfArray.noOfInversion1(new int[]{ 1, 20, 6, 4, 5 }, 5));
    }

    @Test
    public void test3(){
        Assert.assertEquals(5, inversionOfArray.noOfInversion2(new int[]{ 1, 20, 6, 4, 5 }, 5));
    }
}
