package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountTheTripletsTest {

    CountTheTriplets countTheTriplets;

    @Before
    public void setUp(){
        countTheTriplets = new CountTheTriplets();
    }

    @Test
    public void test1(){
        Assert.assertEquals(4, countTheTriplets.countWays(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void test2(){
        Assert.assertEquals(6, countTheTriplets.countWays(new int[]{1, 1, 1, 2, 2}, 5));
    }

    @Test
    public void test3(){
        Assert.assertEquals(2, countTheTriplets.countWays(new int[]{1, 5, 3, 2}, 4));
    }

    @Test
    public void test4(){
        Assert.assertEquals(-1, countTheTriplets.countWays(new int[]{3,2,7}, 3));
    }

}
