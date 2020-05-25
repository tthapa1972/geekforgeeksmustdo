package practice.gfg;

public class PrintSprintMatrixSpirally {

    /*
    Complexity Analysis:
Time Complexity: O(m*n).
To traverse the matrix O(m*n) time is required.
Space Comepxlity:O(1).
No extra space is required.
    * */

    public void printArraySpirally(int [][]matrix){

        int m = matrix.length;

        int n = matrix[0].length;

        int j = 0;

        int l = 0;

        int p = 0;

        while (l < m && p < n){

            for(j = p;j < n;j++){
                System.out.print(matrix[l][j] + " ");
            }

            l++;

            for( j = l;j < m;j++){
                System.out.print(matrix[j][n-1] + " ");
            }

            n--;

            if(l < m){
                for(j = (n-1);j >= p;j--){
                    System.out.print(matrix[m-1][j] + " ");
                }
                m--;
            }

            if(p < n){
                for(j = (m-1);j>=l;j--){
                    System.out.print(matrix[j][p] + " ");
                }
                p++;
            }

        }

    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };

        new PrintSprintMatrixSpirally().printArraySpirally(a);
    }
}
