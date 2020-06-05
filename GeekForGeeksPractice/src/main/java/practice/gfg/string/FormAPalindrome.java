package practice.gfg.string;

public class FormAPalindrome {

    public int minNoOfInsertionToFormPalindrome(String str){

        return (minNoOfInsertionToFormPalindromeUtil(str, 0, str.length() - 1));

    }

    public int minNoOfInsertionToFormPalindromeUtil(String str, int l, int h){

        if(l > h ) return Integer.MAX_VALUE;
        if(l == h) return 0;
        if(l == (h-1)) return ((str.charAt(l) == str.charAt(h)) ? 0 : 1);

        return ((str.charAt(l) == str.charAt(h)) ? minNoOfInsertionToFormPalindromeUtil(str, l+1, h-1) :
                Math.min(minNoOfInsertionToFormPalindromeUtil(str, l+1, h), minNoOfInsertionToFormPalindromeUtil(str, l, h - 1)) + 1);

    }

    /*
    Time complexity: O(N^2)
    Auxiliary Space: O(N^2)
    * */

    public int minNoOfInsertionToFormPalindromeDP(String str){

        int n = str.length();

        int dp[][] = new int[n][n];

        int gap, l, h;

        for(gap = 1;gap < n;gap++){
            for(l=0,h=gap;h<n;l++, h++){
                if(str.charAt(l) == str.charAt(h)){
                    dp[l][h] = dp[l+1][h-1];
                }else{
                    dp[l][h] = Math.min(dp[l+1][h], dp[l][h-1]) + 1;
                }
            }
        }

        return dp[0][n-1];

    }

    public int minNoOfInsertionToFormPalindromeLCS(String str){

        String reverse = reverse(str);

        int n = str.length();

        return (n - LCS(str, reverse, n, n));


    }

    public int LCS(String X, String Y, int m, int n){

        int LCS[][] = new int[m+1][n+1];

        for(int i = 0;i <= m;i++){
            for(int j = 0;j <= n;j++){

                if(i == 0 || j == 0){
                    LCS[i][j] = 0;
                }else if(X.charAt(i-1) == Y.charAt(j-1)){
                    LCS[i][j] = LCS[i-1][j-1] + 1;
                }else {
                    LCS[i][j] = Math.max(LCS[i-1][j] , LCS[i][j-1]) ;
                }

            }
        }

        return LCS[m][n];
    }

    public String reverse(String str){

        char []charArray = str.toCharArray();

        char temp;

        int l = 0;
        int r = str.length() - 1;

        while (l < r){

            temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            l++;
            r--;
        }

        return (new String(charArray));
    }

}
