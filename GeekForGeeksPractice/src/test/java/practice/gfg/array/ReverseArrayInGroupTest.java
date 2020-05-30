package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseArrayInGroupTest {

    ReverseArrayInGroup reverseArrayInGroup;

    @Before
    public void setUp(){
        reverseArrayInGroup = new ReverseArrayInGroup();
    }

    @Test
    public void test1(){
        Assert.assertArrayEquals(new int[]{3, 2, 1, 6, 5, 4, 8, 7}, reverseArrayInGroup.sortInGroup(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3));
    }
}
