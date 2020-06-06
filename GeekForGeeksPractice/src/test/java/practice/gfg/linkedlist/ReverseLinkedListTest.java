package practice.gfg.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseLinkedListTest {

    ReverseLinkedList reverseLinkedList;

    @Before
    public void setUp(){
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    public void test1(){

        Assert.assertArrayEquals(new int[]{5, 4, 3,2, 1}, reverseLinkedList.reverseLinkedList(new int[]{
                1, 2, 3, 4, 5}));
    }

    @Test
    public void test2(){

        Assert.assertArrayEquals(new int[]{6, 9, 8, 7, 4}, reverseLinkedList.reverseLinkedList(new int[]{
                4, 7, 8, 9, 6}));
    }
}
