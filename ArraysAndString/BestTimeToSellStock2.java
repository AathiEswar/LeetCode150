package LeetCode150.ArraysAndString;

public class BestTimeToSellStock2 {
    public int bestTimeToSellStock2(int[] prices){
        int maxProfit = 0;

        for (int i = 1; i <prices.length ; i++) {
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }

    int maxProfit(int[] prices) //peak valley approach
    {
        int i=0;
        int peak=prices[0];
        int valley=prices[0];
        int maxProfit=0;
        while(i<prices.length-1)
        {
            while(i<prices.length-1 && prices[i]>=prices[i+1])
                i++;
            valley=prices[i];
            while(i<prices.length-1 && prices[i+1]>=prices[i])
                i++;//post fix use
            peak=prices[i];
            maxProfit+=peak-valley;
        }
        return maxProfit;
    }
}
