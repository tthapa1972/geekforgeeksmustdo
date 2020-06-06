package practice.gfg.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseLinkedListInGroupTest {

    ReverseLinkedListInGroup reverseLinkedListInGroup;

    @Before
    public void setUp(){
        reverseLinkedListInGroup = new ReverseLinkedListInGroup();
    }

    @Test
    public void test1(){

        Assert.assertArrayEquals(new int[]{4, 2,2,1, 8, 7,6,5}, reverseLinkedListInGroup.reverseLinkedListInGroup(new int[]{
                1, 2, 2, 4, 5,6,7,8}, 4));
    }

    @Test
    public void test2(){

        Assert.assertArrayEquals(new int[]{3,2,1,5,4}, reverseLinkedListInGroup.reverseLinkedListInGroup(new int[]{
                1, 2, 3,4,5}, 3));
    }

}
