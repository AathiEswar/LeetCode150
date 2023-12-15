package LeetCode150.TwoPointers;

public class IsSubSequence {

    public static boolean isSubSequence(String s,String t){
        int i=0;
        int j = 0;
        while(i<s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
    public static void main(String[] args) {
        System.out.println(isSubSequence("aa","aathi"));
    }
}
