package practice.gfg.string;

public class LongestPalindromeInString {

    /*
    Time complexity: O ( n^2 )
Auxiliary Space: O ( n^2 )
    * */

    public String longestPalindrome(String str){

        int n = str.length();

        boolean [][]table = new boolean[n][n];

        int maxLength = 1;

        for(int i = 0;i < n;i++){
            table[i][i] = true;
        }

        int start = 0;

        for(int i = 0;i < (n - 1);i++){
            if(str.charAt(i) == str.charAt(i+1)){
                table[i][i+1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for(int len = 3;len <= n;len++){

            for(int i = 0;i < (n - len + 1);i++){

                int j = i + len - 1;

                if(table[i+1][j-1] && str.charAt(i) == str.charAt(j)){

                    table[i][j] = true;

                    if(maxLength < len){
                        maxLength = len;
                        start = i;
                    }

                }
            }
        }

        return (str.substring(start, start + maxLength));
    }

    /*
    Time complexity: O ( n^2 ) where n is the length of input string.
Auxiliary Space: O ( 1 )
    * */

    public String longestPalindrome1(String str){

        int n = str.length();

        int start = 0;

        int maxLength = 1;

        int low, high;

        for(int i = 1;i < n;i++){

            low = i-1;
            high = i;

            //palindrome of even length

            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high)){

                if((high - low + 1) > maxLength){
                    start = low;
                    maxLength = (high - low + 1);
                }

                low--;
                high++;

            }


            //palindrome with length of odd

            low = i-1;
            high = i+1;

            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high)){

                if((high - low + 1) > maxLength){
                    start = low;
                    maxLength = (high - low + 1);
                }

                low--;
                high++;

            }

        }

        return str.substring(start, start + maxLength);

    }

}
