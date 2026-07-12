
/* 
 * Problem Name: Best Time to Buy and Sell Stock
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Pattern: Arrays
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */


public class Best_Time_to_Buy_and_Sell_Stock 
{
    public int maxProfit(int[] prices) 
    {
       int maxProfit = 0;
       int minPrice = Integer.MAX_VALUE;

       for(int i =0; i<prices.length;i++)
       {
        if(prices[i]<minPrice)
        {
            minPrice = prices[i];
        }
        else if(prices[i]-minPrice>maxProfit)
        {
            maxProfit = prices[i]-minPrice;   
        }
       }
       return maxProfit;
    }
}
