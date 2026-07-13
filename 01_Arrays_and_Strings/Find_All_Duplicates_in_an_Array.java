/*
    Problem Name: Find All Duplicates in an Array
    Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
    Pattern: Arrays
    Time Complexity : O(n)
    Space Complexity : O(1)
 */

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
       List<Integer> list = new ArrayList<>();

       for(int i =0;i<nums.length;i++)
       {
         int key = Math.abs(nums[i]);
         int roomIndex = key-1;

         if(nums[roomIndex]<0)
         {
            list.add(key);
         }
         else
         {
            nums[roomIndex] = -nums[roomIndex];
         }
       }
        return list;
    }
}
