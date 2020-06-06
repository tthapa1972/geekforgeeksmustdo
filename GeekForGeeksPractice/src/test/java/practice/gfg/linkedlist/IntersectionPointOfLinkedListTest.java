package practice.gfg.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionPointOfLinkedListTest {

    IntersectionPointOfLinkedList intersectionPointOfLinkedList;

    @Before
    public void setUp(){
        intersectionPointOfLinkedList = new IntersectionPointOfLinkedList();
    }

    @Test
    public void test1(){
        Assert.assertEquals(4, intersectionPointOfLinkedList.intersectionPointOfLinkedList(new int[]{
                1, 2, 3, 4, 5, 6, 7
        }, new int[]{10, 9, 8, 4, 5, 6, 7}));
    }

    @Test
    public void test2(){
        Assert.assertEquals(15, intersectionPointOfLinkedList.intersectionPointOfLinkedList(new int[]{
                3,6, 9, 15, 30
        }, new int[]{10, 15, 30}));
    }

}
