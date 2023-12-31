package LeetCode150.TwoPointers;

public class ValidPalindrome {
    public static boolean validPalindrome(String s){

        int i=0;
        int j = s.length()-1;

        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;

            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else if(Character.toUpperCase(s.charAt(i)) == Character.toUpperCase(s.charAt(j))){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(validPalindrome("A man, a plan, a canal: Panama"));
    }
}
