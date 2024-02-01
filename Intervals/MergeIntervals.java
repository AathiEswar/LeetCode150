package LeetCode150.Intervals;
import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }

        Arrays.sort(intervals , (arr1 , arr2)-> Integer.compare(arr1[0] , arr2[0] ));

        List<int[]> outputArr = new ArrayList<>();
        int[] curInterval = intervals[0];
        outputArr.add(curInterval);


        for(int[] interval : intervals){
            int curStart = curInterval[0];
            int curEnd = curInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(curEnd >= nextStart){
                curInterval[1] = Math.max(curEnd , nextEnd);
            }
            else{
                curInterval = interval;
                outputArr.add(curInterval);
            }
        }


        return outputArr.toArray(new int[outputArr.size()][]);
    }
}
