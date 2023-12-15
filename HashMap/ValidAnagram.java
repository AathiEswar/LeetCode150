package LeetCode150.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] count = new char[26];

        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            count[ch - 'a']--;
        }
        for( int i : count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
