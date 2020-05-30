package practice.gfg.array;

import java.util.Arrays;

public class NoOfPairs {

    public int noOfPairs(int []X, int []Y, int m,int n){

        int []noOfY = new int[5];

        for(int i = 0;i < n;i++){
            if(Y[i] < 5)
                noOfY[Y[i]]++;
        }

        int totalCount = 0;

        Arrays.sort(Y);

        for(int i = 0;i < m;i++){
            totalCount += noOfPairs(X[i], Y, n, noOfY);
        }

        return totalCount;
    }

    public int noOfPairs(int x, int Y[], int n, int []noOfY){

        if(x == 0) return 0;

        if(x == 1) return noOfY[0];

        int idx = Arrays.binarySearch(Y, x);

        int ans = 0;

        if(idx < 0){
            idx = Math.abs(idx + 1);
            ans = n - idx;
        }else{
            while (idx < n && Y[idx] == x){
                idx++;
            }

            ans = n - idx;
        }

        ans += (noOfY[0] + noOfY[1]);

        if(x == 2) ans -= (noOfY[3] + noOfY[4]);

        if(x==3) ans += noOfY[2];

        return ans;

    }
}
