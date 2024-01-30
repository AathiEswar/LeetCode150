package LeetCode150.ArraysAndString;

import java.util.Arrays;

public class HIndex {
    class Solution {
        public int hIndex(int[] c) {
            Arrays.parallelSort(c);

            int n = c.length,i;

            for(i = 1;i<=n;i++){
                if(c[n-i] < i)break;
            }
            return i-1;
        }
    }
}
