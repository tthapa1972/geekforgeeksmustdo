package practice.gfg.array;

/*
The time required to compute the integral part is O(log(number)) and constant i.e, = precision for computing the fractional part. Therefore, overall time complexity is O(log(number) + precision) which is approximately equal to O(log(number)).

GeeksforGeeks has prepared a complete interview preparation course with premium videos, theory, practice problems, TA support and many more features. Please refer Placement 100 for details


* */

public class SquareRootWithBinarySearch {

    public double findSquareRoot(int num, int precision){

        int start = 0;

        int end = num;

        double ans = 0.0;

        while(start <= end){
            int mid = (start + end) / 2;

            if(mid * mid == num){
                ans = mid;
                break;
            }

            if(mid * mid <= num){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        double increment = 0.1;

        for(int i = 0;i < precision;i++){
            while(ans * ans <= num){
                ans += increment;
            }

            ans -= increment;
            increment = increment/10;
        }

        return ans;
    }
}
