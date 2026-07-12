
/* 
 * Problem Name: Maximum Subarray
 * Link: https://leetcode.com/problems/maximum-subarray/
 * Pattern: Kadane's Algorithm
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class Maximum_Subarray 
{
    public int maxSubArray(int[] nums) 
    {
       
        int currentSum = 0;

        int maxSum = Integer.MIN_VALUE;

        for(int i =0;i<nums.length;i++)
        {
            currentSum =currentSum+ nums[i];

            if(currentSum>maxSum)
            {
                maxSum = currentSum;
            }
            if(currentSum<0)
            {
                currentSum =0;
            }
        }
        return maxSum;
    }
    
}
