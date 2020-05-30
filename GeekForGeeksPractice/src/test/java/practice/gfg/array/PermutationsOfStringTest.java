package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfStringTest {

    PermutationsOfString permutationsOfString;

    @Before
    public void setUp(){
        permutationsOfString = new PermutationsOfString();
    }

    @Test
    public void test1(){
        List<String> list = Arrays.asList("ABC","ACB","BAC", "BCA" ,"CAB", "CBA");

        Assert.assertEquals(list, permutationsOfString.allPermutationsOfString("ABC"));
    }

    @Test
    public void test2(){
        List<String> list = Arrays.asList("ABGS","ABSG","AGBS","AGSB","ASBG","ASGB","BAGS","BASG","BGAS","BGSA","BSAG","BSGA","GABS","GASB","GBAS","GBSA","GSAB","GSBA","SABG","SAGB","SBAG","SBGA","SGAB","SGBA");

        Assert.assertEquals(list, permutationsOfString.allPermutationsOfString("ABSG"));
    }
}
