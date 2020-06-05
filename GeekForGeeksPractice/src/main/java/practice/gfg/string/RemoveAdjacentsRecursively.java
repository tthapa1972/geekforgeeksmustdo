package practice.gfg.string;

import java.util.Stack;

public class RemoveAdjacentsRecursively {

    /*
    * Time Complexity : O(n^2)
    * Space Complexity : O(n) if memory stack is considered
    * */

    public String removeDuplicateRecursiveApproach(String str){

        int orgLen = 0;

        do {
            orgLen = str.length();
            str = removeDuplicateRecursiveApproachUtil(str, orgLen);
        }while (str.length() != orgLen);

        return str;
    }

    public String removeDuplicateIterativeApproach(String str){

        StringBuilder sb = new StringBuilder(str);

        boolean hasChanged;

        int start, end, len;

        char lastChar, currentChar;

        do {

            hasChanged = false;

            len = sb.length();

            if(len == 0){
                break;
            }

            lastChar = sb.charAt(0);


            start = -1;
            end = -1;

            for (int i = 1;i < len;i++){

                currentChar = sb.charAt(i);

                if(lastChar == currentChar){
                    if(start == -1){
                        start = i - 1;
                    }

                    end = i;
                }else if(start != -1){
                    hasChanged = true;
                    sb.replace(start, end+1, "");
                    i -= (end - start + 1);
                    len -= (end - start + 1);
                    start = -1;
                    end = -1;
                }

                lastChar = currentChar;
            }

            if(start != -1){
                hasChanged = true;
                sb.replace(start, end+1, "");
            }
        } while (hasChanged);

        return sb.toString();
    }

    public String removeDuplicateRecursiveApproachUtil(String str, int orgLen){

        if(orgLen == 0 || orgLen == 1){
            return str;
        }


        if(str.charAt(0) == str.charAt(1)){
            int end = 2;

            while(end < orgLen && str.charAt(0) == str.charAt(end)){
                end++;
            }

            str = str.substring(end);

            return removeDuplicateRecursiveApproachUtil(str, str.length());
        }else{
            str = str.charAt(0) + removeDuplicateRecursiveApproachUtil(str.substring(1), orgLen - 1);
        }

        return str;
    }
}