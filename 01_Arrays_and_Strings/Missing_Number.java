/* 
 * Problem Name: Missing Number
 * Link: https://leetcode.com/problems/missing-number/
 * Pattern: Math
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class Missing_Number 
{
    
    public int missingNumber(int[] nums) 
    {
        int sum =0;
        int n = nums.length;
        for(int a : nums)
        {
            sum+=a;
        }

        return ((n*(n+1))/2)-sum;
        
    }
}