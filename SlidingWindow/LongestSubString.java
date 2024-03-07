package LeetCode150.SlidingWindow;

import java.util.HashSet;

public class LongestSubString {

    public int longestSubString(String s){
        //typical sliding window problem algorithm

        HashSet<Character> set = new HashSet<>();
        int left=0;
        int maxCount = 0;

       for(int right = 0 ;right < s.length() ; right+=1){
           if(set.contains(s.charAt(right))){
               while(set.contains(s.charAt(right))){
                   set.remove(s.charAt(left));
                   left++;
               }
           }
           else{
               set.add(s.charAt(right));
               maxCount = Math.max(maxCount , right - left + 1);
           }
       }
return  maxCount;
    }
}
