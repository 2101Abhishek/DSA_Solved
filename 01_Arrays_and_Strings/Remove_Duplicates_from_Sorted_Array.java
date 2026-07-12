
/* 
 * Problem Name: Remove Duplicates from Sorted Array
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Pattern: Two Pointers
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class Remove_Duplicates_from_Sorted_Array 
{
     public int removeDuplicates(int[] nums) 
    {
       int k =1;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i-1]!=nums[i])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    
}
