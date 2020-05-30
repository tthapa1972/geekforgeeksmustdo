package practice.gfg.array;

import java.util.ArrayList;
import java.util.List;

public class StockBuyAndSell {

    public List<Interval> buySellStock(int []array){

        List<Interval> listOfBuySell = new ArrayList<Interval>();

        int n = array.length;

        int i = 0;

        while (i < n){

            while (i < n && array[i+1]<=array[i]){
                i++;
            }

            if (i == (n-1)){
                break;
            }

            Interval interval = new Interval(0, 0);

            interval.buy = i++;

            while (i < n && array[i]>=array[i-1]){
                i++;
            }

            interval.sell = (i-1);

            listOfBuySell.add(interval);

        }

        return listOfBuySell;

    }

}

class Interval{

    int buy, sell;

    public Interval(int buy, int sell){
        this.buy = buy;
        this.sell = sell;
    }

    public String toString(){
        return new String("["+buy+","+sell+"]");
    }

    public boolean equals(Object obj) {
        Interval interval = (Interval) obj;

        if(this.buy == interval.buy && this.sell == interval.sell){
            return true;
        }else{
            return false;
        }
    }

}