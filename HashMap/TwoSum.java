package LeetCode150.HashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        //curNum+x = target
        //x = target - curNum
        Map<Integer,Integer> lookUp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int curElement = nums[i];
            int x = target - curElement;
            if(lookUp.containsKey(x)){
                return new int[]{lookUp.get(x),i};
            }
            lookUp.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String args[]){
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3,4,6},9)));
    }
}
