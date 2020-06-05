package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestPalindromeInStringTest {

    LongestPalindromeInString longestPalindromeInString;

    @Before
    public void setUp(){
        longestPalindromeInString = new LongestPalindromeInString();
    }

    @Test
    public void test1(){
        Assert.assertEquals("geeksskeeg", longestPalindromeInString.longestPalindrome("forgeeksskeegfor"));
    }

    @Test
    public void test2(){
        Assert.assertEquals("aabbaa", longestPalindromeInString.longestPalindrome("aaaabbaa"));
    }

    @Test
    public void test3(){
        Assert.assertEquals("geeksskeeg", longestPalindromeInString.longestPalindrome1("forgeeksskeegfor"));
    }

    @Test
    public void test4(){
        Assert.assertEquals("aabbaa", longestPalindromeInString.longestPalindrome1("aaaabbaa"));
    }


}
