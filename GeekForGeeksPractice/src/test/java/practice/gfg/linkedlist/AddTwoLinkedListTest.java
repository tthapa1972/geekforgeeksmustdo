package practice.gfg.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddTwoLinkedListTest {

    AddTwoLinkedList addTwoLinkedList;

    @Before
    public void setUp(){
        addTwoLinkedList = new AddTwoLinkedList();
    }

    @Test
    public void test1(){
        Assert.assertArrayEquals(new int[]{5,0,0,5,6}, addTwoLinkedList.addTwoLists(new int[]{7,5,9,4,6}, new int[]{
                8,4
        }));
    }
}
