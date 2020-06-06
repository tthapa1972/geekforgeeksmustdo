package practice.gfg.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import practice.gfg.string.FormAPalindrome;

public class MiddleElementInLinkedListTest {

    MiddleElementInLinkedList middleElementInLinkedList;

    @Before
    public void setUp(){
        middleElementInLinkedList = new MiddleElementInLinkedList();
    }

    @Test
    public void test1(){
        Assert.assertEquals(3, middleElementInLinkedList.middleElementInLinkedList(new int[]{
                1, 2, 3, 4, 5
        }));
    }


}
