package practice.gfg.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationsOfString {

    public List<String> allPermutationsOfString(String str){

        List<String> arrayList = new ArrayList<String>();

        permutation("", str, arrayList);

        Collections.sort(arrayList);

        return arrayList;
    }

    public void permutation(String prefix, String str, List<String> list){

        int n = str.length();

        if(n == 0) list.add(prefix);
        else {
            for(int i = 0; i < n;i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1,n), list);
        }
    }
}
