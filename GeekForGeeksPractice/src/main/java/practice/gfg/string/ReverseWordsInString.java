package practice.gfg.string;

public class ReverseWordsInString {

    /*
    Time Complexity: O(n)
    * */

    public String reverseWordsInString(String str){

        int wordbegin = -1;
        char []temp = str.toCharArray();

        for(int i = 0;i < temp.length;i++){

            if(wordbegin == -1 && temp[i] != ' '){
                wordbegin = i;
            }

            if(wordbegin != -1 && temp[i] == '.') {
                reverse(wordbegin, i - 1, temp);
                wordbegin = -1;
            }

            if(wordbegin != -1 && i == temp.length - 1){
                reverse(wordbegin, i, temp);
            }

        }

        reverse(0, temp.length - 1, temp);


        return new String(temp);
    }

    public void reverse(int left, int right, char []charArray){

        char temp = ' ';

        while (left < right){
            temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
    }
}
