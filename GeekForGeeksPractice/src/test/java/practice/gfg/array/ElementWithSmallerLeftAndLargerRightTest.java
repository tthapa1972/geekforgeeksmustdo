package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElementWithSmallerLeftAndLargerRightTest {

    ElementWithSmallerLeftAndLargerRight elementWithSmallerLeftAndLargerRight;

    @Before
    public void setUp(){
        elementWithSmallerLeftAndLargerRight = new ElementWithSmallerLeftAndLargerRight();
    }

    @Test
    public void test1(){
        Assert.assertEquals(4, elementWithSmallerLeftAndLargerRight.findElement(new int[]{5, 1, 4, 3, 6, 8, 10, 7, 9}));
    }

    @Test
    public void test2(){
        Assert.assertEquals(-1, elementWithSmallerLeftAndLargerRight.findElement(new int[]{5, 1, 4, 4}));
    }
}
