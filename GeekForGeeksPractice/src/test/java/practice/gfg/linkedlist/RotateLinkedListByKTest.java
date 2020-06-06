package practice.gfg.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotateLinkedListByKTest {

    RotateLinkedListByK rotateLinkedListByK;

    @Before
    public void setUp(){
        rotateLinkedListByK = new RotateLinkedListByK();
    }

    @Test
    public void test1(){

        Assert.assertArrayEquals(new int[]{5, 6, 7,8, 1,2, 3, 4}, rotateLinkedListByK.rotateLinkedListByK(new int[]{
                1, 2, 3, 4, 5,6,7,8}, 4));
    }

    @Test
    public void test2(){

        Assert.assertArrayEquals(new int[]{8, 9, 2,4 ,7}, rotateLinkedListByK.rotateLinkedListByK(new int[]{
                2, 4,7,8, 9}, 3));
    }
}
