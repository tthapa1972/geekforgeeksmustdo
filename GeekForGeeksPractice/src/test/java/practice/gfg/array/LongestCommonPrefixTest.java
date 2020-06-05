package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix;

    @Before
    public void setUp(){
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void test1(){

        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};

        Assert.assertEquals("gee", longestCommonPrefix.lcpWordByWord(arr));
    }

    @Test
    public void test2(){

        String arr[] = {"apple","ape","april"};

        Assert.assertEquals("ap", longestCommonPrefix.lcpWordByWord(arr));
    }

    @Test
    public void test3(){

        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};

        Assert.assertEquals("gee", longestCommonPrefix.lcpCharacterByCharacter(arr));
    }

    @Test
    public void test4(){

        String arr[] = {"apple","ape","april"};

        Assert.assertEquals("ap", longestCommonPrefix.lcpCharacterByCharacter(arr));
    }

    @Test
    public void test5(){

        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};

        Assert.assertEquals("gee", longestCommonPrefix.lcpDivideAndConquer(arr));
    }

    @Test
    public void test6(){

        String arr[] = {"apple","ape","april"};

        Assert.assertEquals("ap", longestCommonPrefix.lcpDivideAndConquer(arr));
    }

    @Test
    public void test7(){

        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};

        Assert.assertEquals("gee", longestCommonPrefix.lcpBinarySearch(arr));
    }

    @Test
    public void test8(){

        String arr[] = {"apple","ape","april"};

        Assert.assertEquals("ap", longestCommonPrefix.lcpBinarySearch(arr));
    }

    @Test
    public void test9(){

        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};

        Assert.assertEquals("gee", longestCommonPrefix.lcpTrie(arr));
    }

    @Test
    public void test10(){

        String arr[] = {"apple","ape","april"};

        Assert.assertEquals("ap", longestCommonPrefix.lcpTrie(arr));
    }

}
