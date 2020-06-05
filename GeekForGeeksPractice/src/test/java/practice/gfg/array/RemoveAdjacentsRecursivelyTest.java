package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveAdjacentsRecursivelyTest {

    RemoveAdjacentsRecursively removeAdjacentsRecursively;

    @Before
    public void setUp(){
        removeAdjacentsRecursively = new RemoveAdjacentsRecursively();
    }

    @Test
    public void test1(){
        Assert.assertEquals("ay",removeAdjacentsRecursively.removeDuplicateRecursiveApproach("azxxzy"));
    }

    @Test
    public void test2(){
        Assert.assertEquals("gksfor",removeAdjacentsRecursively.removeDuplicateRecursiveApproach("geeksforgeeg"));
    }

    @Test
    public void test3(){
        Assert.assertEquals("",removeAdjacentsRecursively.removeDuplicateRecursiveApproach("caaabbbaacdddd"));
    }

    @Test
    public void test4(){
        Assert.assertEquals("acac",removeAdjacentsRecursively.removeDuplicateRecursiveApproach("acaaabbbacdddd"));
    }

    @Test
    public void test5(){
        Assert.assertEquals("gksfor",removeAdjacentsRecursively.removeDuplicateIterativeApproach("geeksforgeeg"));
    }

    @Test
    public void test6(){
        Assert.assertEquals("",removeAdjacentsRecursively.removeDuplicateIterativeApproach("caaabbbaacdddd"));
    }

    @Test
    public void test7(){
        Assert.assertEquals("acac",removeAdjacentsRecursively.removeDuplicateIterativeApproach("acaaabbbacdddd"));
    }

    @Test
    public void test8(){
        Assert.assertEquals("",removeAdjacentsRecursively.removeDuplicateRecursiveApproach("aaaaaaaaaaaa"));
    }

    @Test
    public void test9(){
        Assert.assertEquals("",removeAdjacentsRecursively.removeDuplicateIterativeApproach("aaaaaaaaaaaaa"));
    }
}
