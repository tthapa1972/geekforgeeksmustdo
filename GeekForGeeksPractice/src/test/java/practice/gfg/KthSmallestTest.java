package practice.gfg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KthSmallestTest {

    KthSmallestElement kthSmallestTest;

    @Before
    public void setUp(){
        kthSmallestTest = new KthSmallestElement();
    }

    @Test
    public void test1(){
        Assert.assertEquals(5, kthSmallestTest.findKthSmallestElement(new int[]{ 12, 3, 5, 7, 19 }, 2));
    }

}
