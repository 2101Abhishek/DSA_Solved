/* 
 * Problem Name: Remove Element
 * Link: https://leetcode.com/problems/remove-element/
 * Pattern: Two Pointers
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class Remove_Element 
{
     public int removeElement(int[] nums, int val) 
    {
        int k =0;
        for(int i = 0 ; i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
        
    }
    
}
