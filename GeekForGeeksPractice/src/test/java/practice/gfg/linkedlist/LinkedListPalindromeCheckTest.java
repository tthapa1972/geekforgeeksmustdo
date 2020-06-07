package practice.gfg.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListPalindromeCheckTest {

    LinkedListPalindromeCheck linkedListPalindromeCheck;

    @Before
    public void setUp(){
        linkedListPalindromeCheck = new LinkedListPalindromeCheck();
    }


    @Test
    public void test1(){
        Assert.assertTrue(linkedListPalindromeCheck.isPalindrome(new int[]{1,2,2,1}));
    }

    @Test
    public void test2(){
        Assert.assertTrue(linkedListPalindromeCheck.isPalindrome(new int[]{1,2,3,2,1}));
    }

    @Test
    public void test3(){
        Assert.assertFalse(linkedListPalindromeCheck.isPalindrome(new int[]{1,2,3,4,5}));
    }

}
