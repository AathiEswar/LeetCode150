package LeetCode150.ArraysAndString;

public class BestTimeToSellStocks {

    public static int bestTimeToSellStocks(int[] nums){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int num : nums){
            if(num<min){
                min = num;
            }
            if(num-min > maxProfit){
                maxProfit = num-min;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,4,5,3,7,9,5,7};
//        System.out.println(majorityElement(arr));
//        System.out.println(majorityElementOwn(arr));
        System.out.println(bestTimeToSellStocks(arr));


    }
}
