package LeetCode150.ArraysAndString;

import java.util.*;

public class MajorityELement {
    public static int majorityElementOwn(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer num : nums){
            if(!map.containsKey(num)){
                map.put(num,Integer.valueOf(1));
            }
            else{
                map.put(num,map.get(num)+1);
                if(map.get(num)>nums.length / 2){
                    return num;
                }
            }
        }

        return 0;
    }

    public static int majorityElement(int[] arr) {
        //if a element is more than half the array then it will always be in the middle after sorting
        Arrays.parallelSort(arr);
        return arr[arr.length/2];
    }

    public static int BoyerMooreAlgorithm(int[] nums){
        int count = 0;
        int candidate = 0;

        for (int num :nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,1,2,2,1,1,1};
//        System.out.println(majorityElement(arr));
//        System.out.println(majorityElementOwn(arr));
        System.out.println(BoyerMooreAlgorithm(arr));


    }

}
