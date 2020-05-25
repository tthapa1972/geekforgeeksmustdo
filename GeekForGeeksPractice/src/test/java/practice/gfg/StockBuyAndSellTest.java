package practice.gfg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.List;

public class StockBuyAndSellTest {

    StockBuyAndSell stockBuyAndSell;

    @Before
    public void setUp(){
        stockBuyAndSell = new StockBuyAndSell();
    }

    @Test
    public void test1(){

        List<Interval> list =  new ArrayList<Interval>();

        list.add(new Interval(0, 3));
        list.add(new Interval(4, 6));

        Assert.assertEquals(list, stockBuyAndSell.buySellStock(new int[]{ 100, 180, 260, 310, 40, 535, 695 }));
    }
}
