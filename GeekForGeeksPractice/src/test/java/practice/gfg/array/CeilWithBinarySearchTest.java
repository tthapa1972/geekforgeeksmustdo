package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CeilWithBinarySearchTest {

    CeilWithBinarySearch ceilWithBinarySearch;

    @Before
    public void setUp(){
        ceilWithBinarySearch = new CeilWithBinarySearch();
    }

    @Test
    public void test1(){
        Assert.assertEquals(3, ceilWithBinarySearch.findCeil(new int[]{1, 2, 8, 10, 10, 12, 19}, 0, 6, 9));

    }
}
