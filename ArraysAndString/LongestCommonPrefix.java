package LeetCode150.ArraysAndString;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder res = new StringBuilder("");
        int i =0;
        int len = strs[0].length();
        while(i<len){
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                res.append(strs[0].charAt(i));
                i++;
            }
            else{
                return res.toString();
            }
        }
        return res.toString();
    }
}
