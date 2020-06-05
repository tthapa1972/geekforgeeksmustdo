package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LargestWindowWithUniqueCharacterTest {

    LargestWindowWithUniqueCharacter largestWindowWithUniqueCharacter;

    @Before
    public void setUp(){
        largestWindowWithUniqueCharacter = new LargestWindowWithUniqueCharacter();
    }

    @Test
    public void test1(){
        Assert.assertEquals(7, largestWindowWithUniqueCharacter.getLengthofLargestWindow("geeksforgeeks"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(6, largestWindowWithUniqueCharacter.getLengthofLargestWindow("ABDEFGABEF"));
    }

    @Test
    public void test3(){
        Assert.assertEquals(1, largestWindowWithUniqueCharacter.getLengthofLargestWindow("BBBB"));
    }

    @Test
    public void test4(){
        Assert.assertEquals(6, largestWindowWithUniqueCharacter.getLengthofLargestWindow("abababcdefababcdab"));
    }

}
