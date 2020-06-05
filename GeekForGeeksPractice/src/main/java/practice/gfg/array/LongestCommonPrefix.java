package practice.gfg.array;

import java.util.Arrays;

public class LongestCommonPrefix {

    private static final int NO_OF_CHARACTERS = 26;

    static class TrieNode{

        TrieNode []children = new TrieNode[NO_OF_CHARACTERS];

        boolean isLeaf;

        public TrieNode(){

            isLeaf = false;

            for(int i = 0;i < NO_OF_CHARACTERS;i++){
                children[i] = null;
            }
        }

    }

    TrieNode root;

    static int indexs;

    public void insert(String key){

        TrieNode pCrawl = root;

        int level = 0;

        int n = key.length();

        int index = 0;

        for(;level < n;level++){
            index = key.charAt(level) - 'a';

            if(pCrawl.children[index] == null){
                pCrawl.children[index] = new TrieNode();
            }

            pCrawl = pCrawl.children[index];
        }

        pCrawl.isLeaf = true;

    }

    public int noOfChildrean(TrieNode pCrawl){

        int count = 0;

        for(int i = 0;i < NO_OF_CHARACTERS;i++){
            if(pCrawl.children[i] != null){
                count++;
                indexs = i;
            }
        }

        return count;

    }

    public String walkTrie(TrieNode root){

        TrieNode pCrawl = root;

        String prefix = "";

        while (noOfChildrean(pCrawl) == 1 && pCrawl.isLeaf == false){
            char ch = (char) ('a' + indexs);
            prefix += ch;
            pCrawl = pCrawl.children[indexs];
        }

        return prefix;

    }

    /*
    * Time Complexity : Inserting all the words in the trie takes O(MN) time and performing a walk on the trie takes O(M) time, where-

N = Number of strings
M = Length of the largest string
Auxiliary Space: To store all the strings we need to allocate O(26*M*N) ~ O(MN) space for the Trie.
    * */

    public String lcpTrie(String []array){

        int n = array.length;

        root = new TrieNode();

        for(int i = 0;i < n;i++){
            insert(array[i]);
        }

        return walkTrie(root);
    }

    /*
    * Time Complexity : Since we are iterating through all the strings and for each string we are iterating though each characters, so we can say that the time complexity is O(N M) where,

N = Number of strings
M = Length of the largest string string
Auxiliary Space : To store the longest prefix string we are allocating space which is O(M).
    * */

    public String lcpWordByWord(String []array){

        String prefix = array[0];

        int n = array.length;

        for(int i = 1;i < n;i++){
            prefix = lcpWordByWordUtil(prefix, array[i]);
        }

        return prefix;
    }

    public String lcpWordByWordUtil(String prefix, String str){

        int n1 = prefix.length();

        int n2 = str.length();

        int i = 0, j = 0;

        String result = "";

        for (;i<n1 && j < n2;i++,j++){
            if(prefix.charAt(i) != str.charAt(j)){
                break;
            }

            result += (str.charAt(j));
        }

        return result;
    }

    /*
    Time Complexity : Since we are iterating through all the characters of all the strings, so we can say that the time complexity is O(N M) where,

N = Number of strings
M = Length of the largest string string
Auxiliary Space : To store the longest prefix string we are allocating space which is O(M).
    * */

    public String lcpCharacterByCharacter(String []array){

        int min = findLengthOfShortestString(array);

        int n = array.length;

        String result = "";

        for(int i = 0;i < min;i++){
            char currentChar = array[0].charAt(i);

            for(int j = 1;j < n;j++){
                if(array[j].charAt(i) != currentChar){
                    return result;
                }
            }

            result += (currentChar);
        }

        return result;
    }

    public int findLengthOfShortestString(String []array){

        int n = array.length;

        int min = array[0].length();

        for(int i = 1;i < n;i++){
            min = Math.min(min, array[i].length());
        }

        return min;
    }

    /*
    * Time Complexity : Since we are iterating through all the characters of all the strings, so we can say that the time complexity is O(N M) where,

N = Number of strings
M = Length of the largest string string
Auxiliary Space : To store the longest prefix string we are allocating space which is O(M Log N).
    * */

    public String lcpDivideAndConquer(String []array){

        return (commonPrefix(array, 0, array.length - 1));
    }

    public String commonPrefix(String []array, int low, int high){

        if(low == high){
            return array[low];
        }

        if(low < high){

            int mid = low + (high - low)/2;

            String str1 = commonPrefix(array, low, mid);
            String str2 = commonPrefix(array, mid + 1, high);

            return (commonPrefixUtil(str1, str2));

        }

        return null;

    }

    public String commonPrefixUtil(String str1, String str2){

        int n1 = str1.length();

        int n2 = str2.length();

        String result = "";

        for(int i = 0, j = 0;i < n1 && j < n2;i++, j++){

            if(str1.charAt(i) != str2.charAt(j)){
                return result;
            }

            result += (str1.charAt(i));

        }

        return result;

    }

    public boolean allContainsPrefix(String []array, int n,String str, int low, int high){

        for(int j = 1;j < n;j++){
            for(int i = low;i <= high;i++){
                if(array[j].charAt(i) != str.charAt(i)){
                    return false;
                }
            }
        }

        return true;
    }

    /*
    * Time Complexity :
The recurrence relation is

T(M) = T(M/2) + O(MN)
where

N = Number of strings
M = Length of the largest string
So we can say that the time complexity is O(NM log M)

Auxiliary Space: To store the longest prefix string we are allocating space which is O(N) where, N = length of the largest string among all the strings
    * */

    public String lcpBinarySearch(String []array){

        int n = array.length;

        int min = findLengthOfShortestString(array);

        int low = 0;
        int high = min - 1;

        String prefix = "";

        while (low <= high){

            int mid = low + (high - low)/2;

            if(allContainsPrefix(array, n, array[0],low, mid)){

                prefix += (array[0].substring(low, mid + 1));

                low = mid + 1;

            }else {
                high = mid - 1;
            }

        }

        return prefix;
    }

    /*
    Time Complexity: O(MAX * n * log n ) where n is the number of strings in the array and MAX is maximum number of characters in any string. Please note that comparison of two strings would take at most O(MAX) time and for sorting n strings, we would need O(MAX * n * log n ) time.
    * */

    public String lcpSorting(String []array){

        int size = array.length;

        if(size == 0){
            return "";
        }

        if(size == 1){
            return array[0];
        }

        Arrays.sort(array);

        int min = Math.min(array[0].length(), array[size-1].length());

        String prefix = "";

        for(int i = 0;i < min;i++){
            if(array[0].charAt(i) == array[size - 1].charAt(i)){
                prefix += (array[0].charAt(i));
            }else {
                break;
            }
        }

        return prefix;

    }
}
