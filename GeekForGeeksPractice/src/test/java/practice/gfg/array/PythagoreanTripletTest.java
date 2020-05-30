package practice.gfg.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PythagoreanTripletTest {

    PythogoreanTriplet pythogoreanTriplet;

    @Before
    public void setUp(){
        pythogoreanTriplet = new PythogoreanTriplet();
    }

    @Test
    public void test1(){
        Assert.assertTrue(pythogoreanTriplet.isPythogoreanTriplet(new int[]{ 3, 1, 4, 6, 5 }));
    }
}
