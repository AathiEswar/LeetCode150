package LeetCode150.ArraysAndString;

public class ProductOfArraySelf {
    public int[] productOfArraySelf(int[] nums ){
        int n = nums.length;
        int suffixProduct = 1;
        int prefixProduct = 1;
        int[] result = new int[n];

        for(int i = 0;i<n;i++){
            result[i] = prefixProduct;
            prefixProduct *= nums[i];

        }

        for(int i = n-1 ; i>=0 ;i--){
            result[i] += suffixProduct;
            suffixProduct *= nums[i];
        }

        return result;
    }
}
