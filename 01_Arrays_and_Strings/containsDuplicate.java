
/* 
 * Problem Name: Contains Duplicate
 * Link: https://leetcode.com/problems/contains-duplicate/
 * Pattern: HashSet
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

import java.util.HashSet;

public class containsDuplicate 
{
     public boolean containsDuplicatee(int[] nums) 
    {
       HashSet<Integer> set = new HashSet<>();

       for(int i=0;i<nums.length;i++)
       {
        if(!(set.add(nums[i])))
        {
           return true;
        }
       }
       return false;
    }

    
}
