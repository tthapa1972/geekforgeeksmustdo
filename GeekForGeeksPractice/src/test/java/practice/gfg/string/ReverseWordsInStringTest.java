package practice.gfg.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import practice.gfg.string.ReverseWordsInString;

public class ReverseWordsInStringTest {

    ReverseWordsInString reverseWordsInString;

    @Before
    public void setUp(){
        reverseWordsInString = new ReverseWordsInString();
    }

    @Test
    public void test1(){
        Assert.assertEquals(new String("much.very.program.this.like.i"), reverseWordsInString.reverseWordsInString("i.like.this.program.very.much"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(new String("mno.pqr"), reverseWordsInString.reverseWordsInString("pqr.mno"));
    }
}
