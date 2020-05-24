package practice.gfg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NoOfPairsTest {

    NoOfPairs noOfPairs;

    @Before
    public void setUp(){
        noOfPairs = new NoOfPairs();
    }

    @Test
    public void test1(){
        Assert.assertEquals(3, noOfPairs.noOfPairs(new int[]{2,1,6}, new int[]{1,5}, 3, 2));
    }
}
