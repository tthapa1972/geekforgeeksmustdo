package practice.gfg;

import java.util.*;

public class LargestNumberFromArray {

    public String findLargestNumber(String []array){

        List<String> list = new ArrayList<String>();

        for(int i = 0;i  < array.length;i++){
            list.add(array[i]);
        }

        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String X, String Y) {

                String XY = X + Y;

                String YX = Y + X;

                return (XY.compareTo(YX) > 0 ? -1 : 1);
            }
        });

        StringBuilder sb = new StringBuilder("");

        for(String s : list){
            sb.append(s);
        }

        return sb.toString();
    }
}
