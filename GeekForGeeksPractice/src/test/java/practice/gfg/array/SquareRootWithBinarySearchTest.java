package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareRootWithBinarySearchTest {

    SquareRootWithBinarySearch squareRootWithBinarySearch;

    @Before
    public void setUp(){
        squareRootWithBinarySearch = new SquareRootWithBinarySearch();
    }

    @Test
    public void test1(){
        Assert.assertEquals(7.071, squareRootWithBinarySearch.findSquareRoot(50,3), 0.001);
        Assert.assertEquals(3.1622, squareRootWithBinarySearch.findSquareRoot(10,4), 0.0001);
    }
}
