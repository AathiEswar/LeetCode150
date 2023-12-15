package LeetCode150.ArraysAndString;

public class RemoveELement {
//    static public int removeElement(int[] nums, int val) {
//        int len = nums.length;
//        if(len == 0)return 0;
//        int last = nums.length-1;
//        int start = 0;
//
//        while(start <=last){
//            if(nums[last]==val){
//                last--;
//            }
//            else{
//                if(nums[start]==val){
//                    int temp = nums[start];
//                    nums[start] = nums[last];
//                    nums[last] = temp;
//                    last--;
//                }
//                start++;
//            }
//
//
//        }
//        return start;
//    }

    public static int RemoveElement(int[] nums , int val){
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,4,0,2};
        System.out.println(RemoveElement(arr,2));

    }
}
