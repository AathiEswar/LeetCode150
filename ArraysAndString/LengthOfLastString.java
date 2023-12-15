package LeetCode150.ArraysAndString;

public class LengthOfLastString {

    public static int lengthOfLastString(String s){
        int count = 0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                count++;
            }
            else{
                if(count>0)return count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastString(""));
    }
}
