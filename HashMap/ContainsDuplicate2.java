package LeetCode150.HashMap;
import java.util.*;

public class ContainsDuplicate2 {
    public boolean containsDupHashSet(int[] nums,int k){
        if(k==0)return false;
        HashSet<Integer> list = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))return true;

            if(i>=k){
                list.remove(i-k);
            }
            list.add(nums[i]);
        }
        return false;
    }

    public boolean containsDupHashMap(int[] nums , int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k ){
                return true;
            }
        }
        return false;
    }
}
