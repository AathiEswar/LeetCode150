package LeetCode150.ArraysAndString;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a1 = {1,2,1,3,1,6,6,8};
        int[] a2 = {2,5,6};
//        mtsa(a1,3,a2,3);
        System.out.println(removeElement(a1,1));
    }

   static public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int last = nums[len-1]==val?len-2:len-1;
        int start = 0;

        while(start <last){
            if(nums[start]==val){
                int temp = nums[start];
                nums[start] = nums[last];
                nums[last] = temp;
                start++;
                last--;
            }
            start++;

        }
        return start-1;
    }

    public static void mtsa( int[] nums1, int m, int[] nums2, int n){
        int last = m+n-1;

        while(m>0 && n>0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[last] = nums1[m-1];
                last--;
                m--;
            }
            else{
                nums1[last] = nums2[n-1];
                last--;
                n--;
            }
        }

        while(n>0){
            nums1[last] = nums2[n-1];
            last--;
            n--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
