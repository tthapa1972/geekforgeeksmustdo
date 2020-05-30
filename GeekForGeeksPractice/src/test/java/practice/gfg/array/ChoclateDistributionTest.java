package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChoclateDistributionTest {

    ChoclateDistributionProblem choclateDistributionProblem;

    @Before
    public void setUp(){
        choclateDistributionProblem = new ChoclateDistributionProblem();
    }

    @Test
    public void test1(){
        Assert.assertEquals(10, choclateDistributionProblem.findMimimumDifference(new int[]{12, 4, 7, 9, 2, 23,
                25, 41, 30, 40, 28,
                42, 30, 44, 48, 43,
                50}, 17, 7));
    }

    @Test
    public void test2(){
        Assert.assertEquals(2, choclateDistributionProblem.findMimimumDifference(new int[]{7, 3, 2, 4, 9, 12, 56}, 7, 3));
    }

    @Test
    public void test3(){
        Assert.assertEquals(6, choclateDistributionProblem.findMimimumDifference(new int[]{3, 4, 1, 9, 56, 7, 9, 12}, 8, 5));
    }

}
