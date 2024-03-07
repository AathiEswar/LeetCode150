package LeetCode150.SlidingWindow;

public class MinSubArray {
    public int minSubArray(int target , int[] nums){
        int left ;
        int sum ;
        int minWindow ;

        int n = nums.length;
        left = 0;
        sum = 0;
        minWindow = Integer.MAX_VALUE;

        for(int right =  0;right < n ; right+=1 ){
            sum += nums[right];

            while(sum >= target){
                minWindow = Math.min(minWindow , right - left +1);

                sum -= nums[left];
                left++;
            }
        }

        return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }
}
