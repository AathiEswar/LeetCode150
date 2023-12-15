package LeetCode150.ArraysAndString;

public class FindFIrstOccurenceOfString {
    public static int findFirstOccurenceOfString(String haystack ,String needle){
        int nlength = needle.length();
        int hlength = haystack.length();
        int j = 0;

        for(int i=0;i<hlength;i++){
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            else{
                i = i-j;
                j=0;
            }
            if(j == nlength)return i-j+1;
        }
        return -1;
    }
    public static void main(String[] args) {

        System.out.println(findFirstOccurenceOfString("sasad" ,"sad"));
    }
}
