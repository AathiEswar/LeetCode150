package LeetCode150.ArraysAndString;

public class ReverseWordsToString {
    public String reverseWords(String s) {
        String [] str = s.trim().split("\\s+");

        StringBuilder ss = new StringBuilder();
        for(int i=str.length-1; i>=0; i--){
            ss.append(str[i]);
            if(i>0) ss.append(" ");
        }
        return ss.toString();
    }

//    public String reverseWords(String s) {
//         int n = s.length();
//         String[] a = s.trim().split("\\s+");

//         int i=0,j=a.length-1;

//         while(i<j){
//             String temp = a[i];
//             a[i] = a[j];
//             a[j] = temp;
//             i++;
//             j--;
//         }
//         return String.join(" ",a);
//     }
}
