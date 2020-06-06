package practice.gfg.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FormAPalindromeTest {

    FormAPalindrome formAPalindrome;

    @Before
    public void setUp(){
        formAPalindrome = new FormAPalindrome();
    }

    @Test
    public void test1(){
        Assert.assertEquals(3, formAPalindrome.minNoOfInsertionToFormPalindrome("geeks"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(3, formAPalindrome.minNoOfInsertionToFormPalindrome("abcd"));
    }

    @Test
    public void test3(){
        Assert.assertEquals(0, formAPalindrome.minNoOfInsertionToFormPalindrome("aba"));
    }

    @Test
    public void test4(){
        Assert.assertEquals(3, formAPalindrome.minNoOfInsertionToFormPalindromeDP("geeks"));
    }

    @Test
    public void test5(){
        Assert.assertEquals(3, formAPalindrome.minNoOfInsertionToFormPalindromeDP("abcd"));
    }

    @Test
    public void test6(){
        Assert.assertEquals(0, formAPalindrome.minNoOfInsertionToFormPalindromeDP("aba"));
    }

    @Test
    public void test7(){
        Assert.assertEquals(3, formAPalindrome.minNoOfInsertionToFormPalindromeLCS("geeks"));
    }

    @Test
    public void test8(){
        Assert.assertEquals(3, formAPalindrome.minNoOfInsertionToFormPalindromeLCS("abcd"));
    }

    @Test
    public void test9(){
        Assert.assertEquals(0, formAPalindrome.minNoOfInsertionToFormPalindromeLCS("aba"));
    }

}
