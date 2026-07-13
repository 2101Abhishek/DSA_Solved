/* 
    Problem Name: Maximum Product Subarray
    Link: https://leetcode.com/problems/maximum-product-subarray/
    Pattern: Arrays
    Time Complexity : O(n)
    Space Complexity : O(1)
 */

public class Maximum_Product_Subarray 
{
    public int maxProduct(int[] nums) 
    {
        int currentMax = nums[0];
        int currentMin = nums[0];
        int maxproduct = nums[0];

        for( int i =1;i<nums.length;i++)
        {
            int choice1 = nums[i];
            int choice2 = currentMax*nums[i];
            int choice3 = currentMin*nums[i];
            
            currentMax=Math.max(choice1,Math.max(choice2,choice3));
            currentMin = Math.min(choice1,Math.min(choice2,choice3));

            if(currentMax >maxproduct)
            {
                maxproduct = currentMax;
            }
        }
        return maxproduct;
        
    }
    
}
