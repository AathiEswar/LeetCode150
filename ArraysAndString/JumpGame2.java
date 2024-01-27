package LeetCode150.ArraysAndString;

public class JumpGame2 {
    public int jump(int[] nums) {
        int count = 0;
        int end = 0;
        int reach = 0;

        for(int i=0;i<nums.length-1;i++){
            reach = Math.max(reach , i+nums[i]);

            if(reach >= nums.length-1){
                count++;
                break;
            }
            if(i == end){
                count++;
                end = reach;
            }

        }

        return count;
    }
}
