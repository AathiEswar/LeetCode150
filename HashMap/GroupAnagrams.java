package LeetCode150.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortWord = new String(ch);

            if(!map.containsKey(sortWord)){
                map.put(sortWord , new ArrayList<>());
            }

            map.get(sortWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
