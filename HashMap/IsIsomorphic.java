package LeetCode150.HashMap;

import java.util.HashMap;

public class IsIsomorphic {

        public boolean isIsomorphic(String s, String t) {
            int[] map1 = new int[200];
            int[] map2 = new int[200];



            for(int i=0;i<s.length();i++){
                if(map1[s.charAt(i)] != map2[t.charAt(i)]){
                    return false;
                }
                map1[s.charAt(i)] = i+1;
                map2[t.charAt(i)] = i+1;
            }
            return true;
        }

    public boolean isIsomorphicOwn(String s, String t) {
        HashMap<Character,Character> lookUp = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(lookUp.containsKey(sc) && lookUp.get(sc) != tc){
                return false;
            }
            else if(!lookUp.containsKey(sc) && lookUp.containsValue(tc)){
                return false;
            }
            lookUp.put(sc,tc);
        }

        return true;
    }
}
