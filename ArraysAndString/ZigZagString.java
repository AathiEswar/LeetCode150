package LeetCode150.ArraysAndString;

import java.util.ArrayList;
import java.util.*;
public class ZigZagString {
    public static String zigZagString(String s , int lenRows){
        // create a list of stringbuilder of lenRows
        List<StringBuilder> result = new ArrayList<>();

        //populate it
        for(int i = 0 ;i<Math.min(lenRows , s.length()) ;i++){
            result.add(new StringBuilder());
        }

        // index to keep track of the ups and downs
        int index = 0;
        // to navigate the iteration
        boolean change = false;

        // iterate through the string
        for(char chr : s.toCharArray()){
            // append the string
            result.get(index).append(chr);

            // if up then index -- or else index++
            if(change){
                index--;
            }
            else{
                index++;
            }

            // if the index reaches the last it must go the opposite side
           if(index == 0 || index == s.length()-1){
               change = !change;
           }
        }

        // sb for result
        StringBuilder sb = new StringBuilder();

        // add the result string
       for(StringBuilder str : result){
           sb.append(str);
       }

       // return the string
       return sb.toString();
    }
}
