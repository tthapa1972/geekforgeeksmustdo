package practice.gfg;

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

}
