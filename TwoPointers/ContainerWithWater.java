package LeetCode150.TwoPointers;

public class ContainerWithWater {
    public int maxArea(int[] height) {
        int i=0 , j = height.length-1;
        int minHeight ,maxCapacity=0;

        while(i<j){
            minHeight = Math.min(height[i] , height[j]);
            maxCapacity = Math.max(minHeight * (j-i) , maxCapacity);

            while(i<j && height[i] <= minHeight){
                i++;
            }
            while(i<j && height[j] <= minHeight){
                j--;
            }
        }
        return maxCapacity;
    }
}
